package br.com.cielo.desafio.dtos;

import java.math.BigDecimal;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ListaControleLancamento {

	@JsonProperty("dataEfetivaLancamento")
	 private Date dataEfetivaLancamento;
	
	@JsonProperty("dataLancamentoContaCorrenteCliente")
	 private Date dataLancamentoContaCorrenteCliente;
	
	@JsonProperty("numeroEvento")
	 private Integer numeroEvento;
	
	@JsonProperty("descricaoGrupoPagamento")
	 private String descricaoGrupoPagamento;
	
	@JsonProperty("codigoIdentificadorUnico")
	 private String codigoIdentificadorUnico;
	
	@JsonProperty("nomeBanco")
	 private String nomeBanco;
	
	@JsonProperty("quantidadeLancamentoRemessa")
	 private Integer quantidadeLancamentoRemessa;
	
	@JsonProperty("numeroRaizCNPJ")
	 private String numeroRaizCNPJ;
	
	@JsonProperty("numeroSufixoCNPJ")
	 private String numeroSufixoCNPJ;
	
	@JsonProperty("valorLancamentoRemessa")
	 private BigDecimal valorLancamentoRemessa;
	
	@JsonProperty("dateLancamentoContaCorrenteCliente")
	 private Long dateLancamentoContaCorrenteCliente;	
	
	@JsonProperty("dateEfetivaLancamento")
	 private Long dateEfetivaLancamento;
	
	@JsonProperty("lancamentoContaCorrenteCliente")
	private LancamentoContaCorrenteCliente lancamentoContaCorrenteCliente;

	public ListaControleLancamento() {
		super();
	}

	public Date getDataEfetivaLancamento() {
		return dataEfetivaLancamento;
	}

	public void setDataEfetivaLancamento(Date dataEfetivaLancamento) {
		this.dataEfetivaLancamento = dataEfetivaLancamento;
	}

	public Date getDataLancamentoContaCorrenteCliente() {
		return dataLancamentoContaCorrenteCliente;
	}

	public void setDataLancamentoContaCorrenteCliente(Date dataLancamentoContaCorrenteCliente) {
		this.dataLancamentoContaCorrenteCliente = dataLancamentoContaCorrenteCliente;
	}

	public Integer getNumeroEvento() {
		return numeroEvento;
	}

	public void setNumeroEvento(Integer numeroEvento) {
		this.numeroEvento = numeroEvento;
	}

	public String getDescricaoGrupoPagamento() {
		return descricaoGrupoPagamento;
	}

	public void setDescricaoGrupoPagamento(String descricaoGrupoPagamento) {
		this.descricaoGrupoPagamento = descricaoGrupoPagamento;
	}

	public String getCodigoIdentificadorUnico() {
		return codigoIdentificadorUnico;
	}

	public void setCodigoIdentificadorUnico(String codigoIdentificadorUnico) {
		this.codigoIdentificadorUnico = codigoIdentificadorUnico;
	}

	public String getNomeBanco() {
		return nomeBanco;
	}

	public void setNomeBanco(String nomeBanco) {
		this.nomeBanco = nomeBanco;
	}

	public Integer getQuantidadeLancamentoRemessa() {
		return quantidadeLancamentoRemessa;
	}

	public void setQuantidadeLancamentoRemessa(Integer quantidadeLancamentoRemessa) {
		this.quantidadeLancamentoRemessa = quantidadeLancamentoRemessa;
	}

	public String getNumeroRaizCNPJ() {
		return numeroRaizCNPJ;
	}

	public void setNumeroRaizCNPJ(String numeroRaizCNPJ) {
		this.numeroRaizCNPJ = numeroRaizCNPJ;
	}

	public String getNumeroSufixoCNPJ() {
		return numeroSufixoCNPJ;
	}

	public void setNumeroSufixoCNPJ(String numeroSufixoCNPJ) {
		this.numeroSufixoCNPJ = numeroSufixoCNPJ;
	}

	public BigDecimal getValorLancamentoRemessa() {
		return valorLancamentoRemessa;
	}

	public void setValorLancamentoRemessa(BigDecimal valorLancamentoRemessa) {
		this.valorLancamentoRemessa = valorLancamentoRemessa;
	}

	public Long getDateLancamentoContaCorrenteCliente() {
		return dateLancamentoContaCorrenteCliente;
	}

	public void setDateLancamentoContaCorrenteCliente(Long dateLancamentoContaCorrenteCliente) {
		this.dateLancamentoContaCorrenteCliente = dateLancamentoContaCorrenteCliente;
	}

	public Long getDateEfetivaLancamento() {
		return dateEfetivaLancamento;
	}

	public void setDateEfetivaLancamento(Long dateEfetivaLancamento) {
		this.dateEfetivaLancamento = dateEfetivaLancamento;
	}

	public LancamentoContaCorrenteCliente getLancamentoContaCorrenteCliente() {
		return lancamentoContaCorrenteCliente;
	}

	public void setLancamentoContaCorrenteCliente(LancamentoContaCorrenteCliente lancamentoContaCorrenteCliente) {
		this.lancamentoContaCorrenteCliente = lancamentoContaCorrenteCliente;
	}

	
	
}
