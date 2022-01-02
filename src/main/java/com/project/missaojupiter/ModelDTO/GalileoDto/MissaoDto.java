package com.project.missaojupiter.ModelDTO.GalileoDto;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

public class MissaoDto {

	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy")
	private Date dataDeLacamento;
	private String destino;
	
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy")
	private Date dataDeAterrissagem;
	private String veiculoDeLancamento;
	

	public Date getDataDeLacamento() {
		return dataDeLacamento;
	}

	public void setDataDeLacamento(Date dataDeLacamento) {
		this.dataDeLacamento = dataDeLacamento;
	}

	public String getDestino() {
		return destino;
	}

	public void setDestino(String destino) {
		this.destino = destino;
	}

	public Date getDataDeAterrissagem() {
		return dataDeAterrissagem;
	}

	public void setDataDeAterrissagem(Date dataDeAterrissagem) {
		this.dataDeAterrissagem = dataDeAterrissagem;
	}

	public String getVeiculoDeLancamento() {
		return veiculoDeLancamento;
	}

	public void setVeiculoDeLancamento(String veiculoDeLancamento) {
		this.veiculoDeLancamento = veiculoDeLancamento;
	}
	
}
