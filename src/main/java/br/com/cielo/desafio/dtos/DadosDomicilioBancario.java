package br.com.cielo.desafio.dtos;

import com.fasterxml.jackson.annotation.JsonProperty;

public class DadosDomicilioBancario {
	
	@JsonProperty("codigoBanco")
	private Integer codigoBanco;
	
	@JsonProperty("numeroAgencia")
	private Integer numeroAgencia;
	
	@JsonProperty("numeroContaCorrente")
	private String numeroContaCorrente;

	public DadosDomicilioBancario() {
		super();
	}

	public DadosDomicilioBancario(Integer codigoBanco, Integer numeroAgencia, String numeroContaCorrente) {
		super();
		this.codigoBanco = codigoBanco;
		this.numeroAgencia = numeroAgencia;
		this.numeroContaCorrente = numeroContaCorrente;
	}

	public Integer getCodigoBanco() {
		return codigoBanco;
	}

	public void setCodigoBanco(Integer codigoBanco) {
		this.codigoBanco = codigoBanco;
	}

	public Integer getNumeroAgencia() {
		return numeroAgencia;
	}

	public void setNumeroAgencia(Integer numeroAgencia) {
		this.numeroAgencia = numeroAgencia;
	}

	public String getNumeroContaCorrente() {
		return numeroContaCorrente;
	}

	public void setNumeroContaCorrente(String numeroContaCorrente) {
		this.numeroContaCorrente = numeroContaCorrente;
	}
	
	
	
}
