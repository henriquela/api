package br.com.cielo.desafio.dtos;

import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ExtratoLancamentosConta {
	
	//@JsonProperty("totalControleLancamento")
	//private TotalControleLancamento totalControleLancamento;
	
	@JsonProperty("listaControleLancamento")
	private List<ListaControleLancamento> listaControleLancamento;
	
	//@JsonProperty("listaControleLancamento")
	
	@JsonProperty("indice")
	private Integer indice;
	
	@JsonProperty("tamanhoPagina")
	private Integer tamanhoPagina;
	
	@JsonProperty("totalElements")
	private Integer totalElements;

	private Map<String, Object> totalControleLancamento;
	
	public ExtratoLancamentosConta() {
		super();
	}

	
	public List<ListaControleLancamento> getListaControleLancamento() {
		return listaControleLancamento;
	}

	public void setListaControleLancamento(List<ListaControleLancamento> listaControleLancamento) {
		this.listaControleLancamento = listaControleLancamento;
	}


	public Integer getIndice() {
		return indice;
	}


	public void setIndice(Integer indice) {
		this.indice = indice;
	}


	public Integer getTamanhoPagina() {
		return tamanhoPagina;
	}


	public void setTamanhoPagina(Integer tamanhoPagina) {
		this.tamanhoPagina = tamanhoPagina;
	}


	public Integer getTotalElements() {
		return totalElements;
	}


	public void setTotalElements(Integer totalElements) {
		this.totalElements = totalElements;
	}


	public Map<String, Object> getTotalControleLancamento() {
		return totalControleLancamento;
	}


	public void setTotalControleLancamento(Map<String, Object> totalControleLancamento) {
		this.totalControleLancamento = totalControleLancamento;
	}


	
}

