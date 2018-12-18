package br.com.cielo.desafio.repository;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.cielo.desafio.models.ControleLancamentos;

@Transactional
public interface ControleLancamentosRepository extends JpaRepository<ControleLancamentos, Long>{	

}
