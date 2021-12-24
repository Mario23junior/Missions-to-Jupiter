package com.project.missaojupiter.Dto.GalileoDto;

import java.util.Date;

public class MissaoDto {

	private Long id;
	private Date dataDeLacamento;
	private String destino;
	private Date dataDeAterrissagem;
	private String veiculoDeLancamento;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

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
