package br.com.cielo.desafio.responses;

public class Erro400Campos {

	private String campo;
	
	private String mensagem;
	
	private String valor;

	public Erro400Campos(String campo, String mensagem, String valor) {
		super();
		this.campo = campo;
		this.mensagem = mensagem;
		this.valor = valor;
	}

	public Erro400Campos() {
		super();
	}

	public String getCampo() {
		return campo;
	}

	public void setCampo(String campo) {
		this.campo = campo;
	}

	public String getMensagem() {
		return mensagem;
	}

	public void setMensagem(String mensagem) {
		this.mensagem = mensagem;
	}

	public String getValor() {
		return valor;
	}

	public void setValor(String valor) {
		this.valor = valor;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((campo == null) ? 0 : campo.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Erro400Campos other = (Erro400Campos) obj;
		if (campo == null) {
			if (other.campo != null)
				return false;
		} else if (!campo.equals(other.campo))
			return false;
		return true;
	}
	
	
}
