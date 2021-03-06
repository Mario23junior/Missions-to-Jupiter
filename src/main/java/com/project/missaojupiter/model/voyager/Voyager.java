package com.project.missaojupiter.model.voyager;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.project.missaojupiter.model.Galileo.Galileo;

@Entity
public class Voyager {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	private String nome;
	private String destino;
	
	@Column(name = "data_lancamento")
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy")
	private Date dataLancamento;
	private String tipo;
	private boolean tripulada;

	@ManyToOne
	private Galileo galileo;

	public Voyager() {
		// TODO Auto-generated constructor stub
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDestino() {
		return destino;
	}

	public void setDestino(String destino) {
		this.destino = destino;
	}

	public Date getDataLancamento() {
		return dataLancamento;
	}

	public void setDataLancamento(Date dataLancamento) {
		this.dataLancamento = dataLancamento;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public boolean isTripulada() {
		return tripulada;
	}

	public void setTripulada(boolean tripulada) {
		this.tripulada = tripulada;
	}

	public Galileo getGalileo() {
		return galileo;
	}

	public void setGalileo(Galileo galileo) {
		this.galileo = galileo;
	}

}