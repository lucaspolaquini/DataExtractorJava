package com.itau.microserviceDataExtract.domain.az5;

import javax.persistence.*;

@Entity
@Table(name="tb_cadcli")
public class Cliente {
	@Column(name="id_cliente")
	@Id
	private Integer id;
    @Column(name="nome")
    private String nome;
    @Column(name="no_documento")
    private String documento;

    @Column(name="segmn_cli")
    private String segmento;

    @Column(name = "plataforma")
    private String plataforma;

    public Cliente() {
    }

    public Cliente(int id) {
        this.setId(id);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public String getSegmento() {
        return segmento;
    }

    public void setSegmento(String segmento) {
        this.segmento = segmento;
    }

    public String getPlataforma() {
        return plataforma;
    }

    public void setPlataforma(String plataforma) {
        this.plataforma = plataforma;
    }

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}
    
    
}