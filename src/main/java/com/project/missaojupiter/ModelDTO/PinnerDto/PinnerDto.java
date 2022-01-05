package com.project.missaojupiter.ModelDTO.PinnerDto;

import java.util.Date;

import javax.persistence.Column;

import com.fasterxml.jackson.annotation.JsonFormat;

public class PinnerDto {

	private Long id;

	private String nome;
	private String descricao;
	
	@Column(name = "data_de_construcao")
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy")
	private Date dataDeConstrucao;
	private String objetivo;
	private boolean tripulada;

	
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public PinnerDto() {
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

}
