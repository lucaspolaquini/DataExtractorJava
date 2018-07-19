package com.itau.microserviceDataExtract.domain.az1;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="tb_regmov")
public class Movimentacao {

	@Column(name="id_mov")
	@Id
	private Integer id;
	
    @Column(name="data")
    private LocalDate data;
    
    
    @Column(name="id_cliente", insertable=false, updatable=false)
    private int id_Cliente;
    
    
    @Column(name="Tipo_C_V")
    private String tipo_C_V;
    
    @Column(name="id_ativo", insertable=false, updatable=false)
    private int id_Ativo;
    
    
    @Column(name="Qtde")
    private int Qtde;
    
    
    @Column(name="ValorOper")
    private Double valorOperacao;
    
    @OneToOne
    @JoinColumn(name = "id_ativo")   
    private Ativo ativo;
    
    @OneToOne
    @JoinColumn(name = "id_cliente")   
    private Cliente cliente;
    
    
	public Movimentacao() {
		super();
	}


	

	public Movimentacao(Integer id, LocalDate data, int id_Cliente, String tipo_C_V, int id_Ativo, int qtde,
			Double valorOperacao, Ativo ativo, Cliente cliente) {
		super();
		this.id = id;
		this.data = data;
		this.id_Cliente = id_Cliente;
		this.tipo_C_V = tipo_C_V;
		this.id_Ativo = id_Ativo;
		Qtde = qtde;
		this.valorOperacao = valorOperacao;
		this.ativo = ativo;
		this.cliente = cliente;
	}




	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public LocalDate getData() {
		return data;
	}


	public void setData(LocalDate data) {
		this.data = data;
	}


	public int getId_Cliente() {
		return id_Cliente;
	}


	public void setId_Cliente(int id_Cliente) {
		this.id_Cliente = id_Cliente;
	}


	public String getTipo_C_V() {
		return tipo_C_V;
	}


	public void setTipo_C_V(String tipo_C_V) {
		this.tipo_C_V = tipo_C_V;
	}


	public int getId_Ativo() {
		return id_Ativo;
	}


	public void setId_Ativo(int id_Ativo) {
		this.id_Ativo = id_Ativo;
	}


	public int getQtde() {
		return Qtde;
	}


	public void setQtde(int qtde) {
		Qtde = qtde;
	}


	public Double getValorOperacao() {
		return valorOperacao;
	}


	public void setValorOperacao(Double valorOperacao) {
		this.valorOperacao = valorOperacao;
	}


	public Ativo getAtivo() {
		return ativo;
	}


	public void setAtivo(Ativo ativo) {
		this.ativo = ativo;
	}




	public Cliente getCliente() {
		return cliente;
	}




	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
    
	
	
}
