package com.itau.microserviceDataExtract.domain.az2;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tb_cadativo")
public class Ativo {
	@Column(name="id_Ativo")
	@Id
	private Integer id_ativo;
	
    @Column(name="plataforma")
    private String plataforma;
    
    @Column(name="cod_ativo")
    private String cod_ativo;

    @Column(name="nom_ativo")
    private String nomeAtivo;

	public Ativo(Integer id, String plataforma, String cod_ativo, String nomeAtivo) {
		super();
		this.id_ativo = id;
		this.plataforma = plataforma;
		this.cod_ativo = cod_ativo;
		this.nomeAtivo = nomeAtivo;
	}

	public Ativo() {
		super();
	}

	public Integer getId() {
		return id_ativo;
	}

	public void setId(Integer id) {
		this.id_ativo = id;
	}

	public String getPlataforma() {
		return plataforma;
	}

	public void setPlataforma(String plataforma) {
		this.plataforma = plataforma;
	}

	public String getCod_ativo() {
		return cod_ativo;
	}

	public void setCod_ativo(String cod_ativo) {
		this.cod_ativo = cod_ativo;
	}

	public String getNomeAtivo() {
		return nomeAtivo;
	}

	public void setNomeAtivo(String nomeAtivo) {
		this.nomeAtivo = nomeAtivo;
	}

}
