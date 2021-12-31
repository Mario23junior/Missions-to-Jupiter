package com.project.missaojupiter.ModelDTO.voyagerDto;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

public class VoyagerDto {

	private String nome;
	private String destino;
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy")
	private Date dataLancamento;
	private String tipo;
	private boolean tripulada;

	public VoyagerDto() {
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
}
