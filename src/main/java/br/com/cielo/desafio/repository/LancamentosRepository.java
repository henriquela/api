package br.com.cielo.desafio.repository;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.cielo.desafio.models.Lancamentos;

@Transactional
public interface LancamentosRepository extends JpaRepository<Lancamentos, Long>{

}
