package br.com.cielo.desafio.dtos;

import com.fasterxml.jackson.annotation.JsonProperty;

public class LancamentoContaCorrenteCliente {
	@JsonProperty("numeroRemessaBanco")
	 private Long numeroRemessaBanco;
	
	@JsonProperty("nomeSituacaoRemessa")
	 private String nomeSituacaoRemessa;
	
	@JsonProperty("nomeTipoOperacao")
	 private String nomeTipoOperacao;
	
	@JsonProperty("dadosDomicilioBancario")	
	private DadosDomicilioBancario dadosDomicilioBancario;
	
	public LancamentoContaCorrenteCliente() {
		super();
	}

	
	public LancamentoContaCorrenteCliente(Long numeroRemessaBanco, String nomeSituacaoRemessa, String nomeTipoOperacao) {
		super();
		this.numeroRemessaBanco = numeroRemessaBanco;
		this.nomeSituacaoRemessa = nomeSituacaoRemessa;
		this.nomeTipoOperacao = nomeTipoOperacao;
	}

	public Long getNumeroRemessaBanco() {
		return numeroRemessaBanco;
	}

	public void setNumeroRemessaBanco(Long numeroRemessaBanco) {
		this.numeroRemessaBanco = numeroRemessaBanco;
	}

	public String getNomeSituacaoRemessa() {
		return nomeSituacaoRemessa;
	}

	public void setNomeSituacaoRemessa(String nomeSituacaoRemessa) {
		this.nomeSituacaoRemessa = nomeSituacaoRemessa;
	}

	public String getNomeTipoOperacao() {
		return nomeTipoOperacao;
	}

	public void setNomeTipoOperacao(String nomeTipoOperacao) {
		this.nomeTipoOperacao = nomeTipoOperacao;
	}


	public DadosDomicilioBancario getDadosDomicilioBancario() {
		return dadosDomicilioBancario;
	}


	public void setDadosDomicilioBancario(DadosDomicilioBancario dadosDomicilioBancario) {
		this.dadosDomicilioBancario = dadosDomicilioBancario;
	}
	
	
}