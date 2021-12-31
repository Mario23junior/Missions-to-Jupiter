package com.project.missaojupiter.ModelDTO.PinnerDto;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

public class PinnerDto {

	private String nome;
	private String descricao;
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy")
	private Date dataDeConstrucao;
	private String objetivo;
	private boolean tripulada;

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
