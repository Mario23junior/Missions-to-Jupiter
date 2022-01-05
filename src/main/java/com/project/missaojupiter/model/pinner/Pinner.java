package com.project.missaojupiter.model.pinner;

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
public class Pinner {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	private String nome;
	private String descricao;
	
	@Column(name = "data_de_construcao")
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy")
	private Date dataDeConstrucao;
	private String objetivo;
	private boolean tripulada;

	@ManyToOne
	private Galileo galileo;

	public Pinner() {
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

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Date getDataDeConstrucao() {
		return dataDeConstrucao;
	}

	public void setDataDeConstrucao(Date dataDeConstrucao) {
		this.dataDeConstrucao = dataDeConstrucao;
	}

	public String getObjetivo() {
		return objetivo;
	}

	public void setObjetivo(String objetivo) {
		this.objetivo = objetivo;
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
