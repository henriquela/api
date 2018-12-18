package br.com.cielo.desafio.service.impl;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.validation.ValidationException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.cielo.desafio.dtos.DadosDomicilioBancario;
import br.com.cielo.desafio.dtos.ExtratoLancamentosConta;
import br.com.cielo.desafio.dtos.LancamentoContaCorrenteCliente;
import br.com.cielo.desafio.dtos.ListaControleLancamento;
import br.com.cielo.desafio.models.ControleLancamentos;
import br.com.cielo.desafio.repository.ControleLancamentosRepository;
import br.com.cielo.desafio.service.ExtratoLancamentosContaService;

/**
 * Extrato de Lançamentos em conta
 * 
 * @author Henrique Landim dos Santos
 * @version 1.0
 * @since   2018-12-18 
 */
@Service
public class ExtratoLancamentosContaServiceImpl implements ExtratoLancamentosContaService{

	Integer qtdLanc = 0, qtdRemessas = 0;
	BigDecimal vlLanc = new BigDecimal(0);  
	
	
	@Autowired
	ControleLancamentosRepository contLancRepository;
	
	@Override
	public ExtratoLancamentosConta listaExtratoLancamentosConta() throws ValidationException{
		

		
		List<ControleLancamentos> lstCtrlLanc =  
				contLancRepository.findAll();
		
		
		if (lstCtrlLanc.isEmpty()) {
			return null;
		}
		
		ExtratoLancamentosConta extCta = new ExtratoLancamentosConta();
		LancamentoContaCorrenteCliente lctoCCCli = new LancamentoContaCorrenteCliente();
		DadosDomicilioBancario domiBanca = new DadosDomicilioBancario();
		List<ListaControleLancamento> lstContLanc = new ArrayList<>(); 
		lstCtrlLanc.forEach(a-> {
			ListaControleLancamento contLanc = new ListaControleLancamento();
				contLanc.setCodigoIdentificadorUnico(a.getCodigoIdentificadorUnico());
				contLanc.setDataEfetivaLancamento(a.getDataEfetivaLancamento());
				contLanc.setDataLancamentoContaCorrenteCliente(a.getDataLancamentoContaCorrenteCliente());
				contLanc.setDateEfetivaLancamento(a.getDataEfetivaLancamento().getTime());
				contLanc.setDateLancamentoContaCorrenteCliente(a.getDataLancamentoContaCorrenteCliente().getTime());
				contLanc.setDescricaoGrupoPagamento(a.getDescricaoGrupoPagamento());
				contLanc.setNomeBanco(a.getNomeBanco());
				contLanc.setNumeroEvento(a.getNumeroEvento());
				contLanc.setNumeroRaizCNPJ(a.getNumeroRaizCNPJ());
				contLanc.setNumeroSufixoCNPJ(a.getNumeroSufixoCNPJ());
				contLanc.setQuantidadeLancamentoRemessa(a.getQuantidadeLancamentoRemessa());
				contLanc.setValorLancamentoRemessa(a.getValorLancamentoRemessa());

				//dadosDomicilioBancario
				domiBanca.setCodigoBanco(a.getLancamentos().getDomiciosBancarios().getCodigoBanco());
				domiBanca.setNumeroAgencia(a.getLancamentos().getDomiciosBancarios().getNumeroAgencia());
				domiBanca.setNumeroContaCorrente(a.getLancamentos().getDomiciosBancarios().getNumeroContaCorrente());
				
				//lancamentoContaCorrenteCliente
				lctoCCCli.setNomeSituacaoRemessa(a.getLancamentos().getNomeSituacaoRemessa());
				lctoCCCli.setNomeTipoOperacao(a.getLancamentos().getNomeTipoOperacao());
				lctoCCCli.setNumeroRemessaBanco(a.getLancamentos().getNumeroRemessaBanco());
				lctoCCCli.setDadosDomicilioBancario(domiBanca);
				
				contLanc.setLancamentoContaCorrenteCliente(lctoCCCli);
				
			lstContLanc.add(contLanc);	
						
		
			//Total Controle Lancamento
			qtdLanc += a.getQuantidadeLancamentoRemessa();
			qtdRemessas += a.getQuantidadeLancamentoRemessa();
			vlLanc = vlLanc.add(a.getValorLancamentoRemessa());
		});
		
		extCta.setListaControleLancamento(lstContLanc);
		
		Map<String, Object> totContLanc = new HashMap<String, Object>();
		totContLanc.put("quantidadeLancamentos", qtdLanc);
		totContLanc.put("quantidadeRemessas", qtdRemessas);
		totContLanc.put("valorLancamentos", vlLanc);

		extCta.setTotalControleLancamento(totContLanc);
				
		extCta.setIndice(lstCtrlLanc.size());
		
		return extCta;
	}
	
	
	

}
