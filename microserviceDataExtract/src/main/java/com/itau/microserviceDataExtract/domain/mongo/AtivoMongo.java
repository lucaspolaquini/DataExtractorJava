package com.itau.microserviceDataExtract.domain.mongo;

import java.math.BigInteger;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "ativo")
public class AtivoMongo {
	
	@Id
	private String id;
	
	private Long idCliente;
	
	private Long idMov;
	
	private String nome;
	
	private Long numeroDocumento;
	
	private Long codAtivo;

	private String nomeAtivo;

	private Integer quantidade;
	
	private Double Valor;
	
	private String nomePlataforma;
	
	private String tipoMov;	
	


	


	public AtivoMongo(String id, Long idCliente, Long idMov, String nome, Long numeroDocumento, Long codAtivo,
			String nomeAtivo, Integer quantidade, Double valor, String nomePlataforma, String tipoMov) {
		super();
		this.id = id;
		this.idCliente = idCliente;
		this.idMov = idMov;
		this.nome = nome;
		this.numeroDocumento = numeroDocumento;
		this.codAtivo = codAtivo;
		this.nomeAtivo = nomeAtivo;
		this.quantidade = quantidade;
		Valor = valor;
		this.nomePlataforma = nomePlataforma;
		this.tipoMov = tipoMov;
	}



	public AtivoMongo() {
		
	}

	

	public Double getValor() {
		return Valor;
	}

	public void setValor(Double valor) {
		Valor = valor;
	}

	public String getNomePlataforma() {
		return nomePlataforma;
	}

	public void setNomePlataforma(String nomePlataforma) {
		this.nomePlataforma = nomePlataforma;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Long getNumeroDocumento() {
		return numeroDocumento;
	}

	public void setNumeroDocumento(Long numeroDocumento) {
		this.numeroDocumento = numeroDocumento;
	}

	public String getNomeAtivo() {
		return nomeAtivo;
	}

	public void setNomeAtivo(String nomeAtivo) {
		this.nomeAtivo = nomeAtivo;
	}

	public Integer getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}



	public Long getIdCliente() {
		return idCliente;
	}



	public void setIdCliente(Long idCliente) {
		this.idCliente = idCliente;
	}



	public Long getIdMov() {
		return idMov;
	}



	public void setIdMov(Long idMov) {
		this.idMov = idMov;
	}



	public Long getCodAtivo() {
		return codAtivo;
	}



	public void setCodAtivo(Long codAtivo) {
		this.codAtivo = codAtivo;
	}



	public String getTipoMov() {
		return tipoMov;
	}



	public void setTipoMov(String tipoMov) {
		this.tipoMov = tipoMov;
	}



	public String getId() {
		return id;
	}



	public void setId(String id) {
		this.id = id;
	}



	
	
	 
}
