package br.com.cielo.desafio.responses;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Erro400 {

	private String codigo;
	
	private String mensagem;
	
	private List<Erro400Campos> campos;

	private Erro400(Builder builder) {
		this.codigo = builder.codigo;
		this.mensagem = builder.mensagem;
		this.campos = builder.campos;
	}
	
	public Erro400() {
		super();
		campos = new ArrayList<>();
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getMensagem() {
		return mensagem;
	}

	public void setMensagem(String mensagem) {
		this.mensagem = mensagem;
	}

	public List<Erro400Campos> getCampos() {
		return campos;
	}

	public void setCampos(List<Erro400Campos> campos) {
		this.campos = campos;
	}
	
	
	public static class Builder{
		
		private String codigo;
		
		private String mensagem;
		
		private List<Erro400Campos> campos;
		
		public Builder codigo(String codigo) {
			this.codigo = codigo;
			return this;
		}
		
		public Builder mensagem(String mensagem) {
			this.mensagem = mensagem;
			return this;
		}
		
		public Builder mensagem(Exception exception) {
			this.mensagem = exception.getMessage();
			return this;
		}
		
		public Builder campo(String campo, String mensagem, String valor) {
			if(this.campos ==null)
				this.campos = new ArrayList<>();
			this.campos.add(new Erro400Campos(campo, mensagem, valor));
			return this;
		}
		
		public Erro400 build() {
			return new Erro400(this);
		}
		
	}
	
	public void adicionarCampo(Erro400Campos mensagemCampo) {
		Optional<Erro400Campos> findFirst = this.campos.stream().filter(a -> a.equals(mensagemCampo)).findFirst();
	
			if (findFirst.isPresent()) {
				Erro400Campos campo = findFirst.get();
				campo.setMensagem(campo.getMensagem().concat(". ").concat(mensagemCampo.getMensagem()));
			}else {
				this.campos.add(mensagemCampo);
			}
	
	}
	
	
	
}
