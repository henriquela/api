package br.com.cielo.desafio.service;

import javax.validation.ValidationException;

import br.com.cielo.desafio.dtos.ExtratoLancamentosConta;

public interface ExtratoLancamentosContaService {

	ExtratoLancamentosConta listaExtratoLancamentosConta() throws ValidationException; 
	
}
