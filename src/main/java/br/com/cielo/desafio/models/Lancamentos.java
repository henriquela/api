package br.com.cielo.desafio.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
public class Lancamentos {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	
	@NotNull
	@Column(name="NOME_TIPO_OPERACAO", length=10)
	@Size(min=2, message="Nome tipo Operação requer no mínimo 2 caracteres.")
	private String nomeTipoOperacao;
	
	@NotNull
	@Column(name="NUMERO_REMESSA_BANCO")
	private Long numeroRemessaBanco;
	
	@NotNull
	@Column(name="NOME_SITU_REMESSA", length=10)
	private String nomeSituacaoRemessa;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name = "domiciosBancarios", nullable=false, insertable=true, updatable=true)
	private DomiciosBancarios domiciosBancarios;

	public Lancamentos() {
		super();
	}

	public Lancamentos(Long id,
			String nomeTipoOperacao,
			Long numeroRemessaBanco,
			String nomeSituacaoRemessa,
			DomiciosBancarios domiciosBancarios) {
		super();
		this.id = id;
		this.nomeTipoOperacao = nomeTipoOperacao;
		this.numeroRemessaBanco = numeroRemessaBanco;
		this.nomeSituacaoRemessa = nomeSituacaoRemessa;
		this.domiciosBancarios = domiciosBancarios;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNomeTipoOperacao() {
		return nomeTipoOperacao;
	}

	public void setNomeTipoOperacao(String nomeTipoOperacao) {
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

	public DomiciosBancarios getDomiciosBancarios() {
		return domiciosBancarios;
	}

	public void setDomiciosBancarios(DomiciosBancarios domiciosBancarios) {
		this.domiciosBancarios = domiciosBancarios;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
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
		Lancamentos other = (Lancamentos) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	
	
	
}
