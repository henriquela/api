package br.com.cielo.desafio.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.cielo.desafio.dtos.ExtratoLancamentosConta;
import br.com.cielo.desafio.responses.Response;
import br.com.cielo.desafio.service.ExtratoLancamentosContaService;

/**
 * Extrato de Lançamentos em conta
 * 
 * @author Henrique Landim dos Santos
 * @version 1.0
 * @since   2018-12-18 
 */

@RestController
@CrossOrigin("*")
@RequestMapping("/lancamentos-contas")
public class LancamentosContasController {
	
	@Autowired
	ExtratoLancamentosContaService service;
	
	/**
	 * Retorna toda a lista, sem filtros
	 * 
	 * @return lista com Extrato de Lançamentos em conta (consolidado)
	 */
	@GetMapping 
	public ResponseEntity listarExtratoLancamentosContas() {
		
		Response<ExtratoLancamentosConta> response = new Response<>();
		
		
		ExtratoLancamentosConta extrLancConta = 
				service.listaExtratoLancamentosConta();
		
		
		if (null==extrLancConta) {
			return ResponseEntity.noContent().build();
		}
		
		response.setData(extrLancConta);
		
		return ResponseEntity.ok(response);
		
	}
		

}
