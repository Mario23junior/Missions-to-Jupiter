package com.project.missaojupiter.ModelDTO.GalileoDto;

import java.util.Date;

import javax.persistence.Column;

import com.fasterxml.jackson.annotation.JsonFormat;

public class MissaoDto {

	private Long id;
	
	@Column(name = "data_de_lacamento")
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy")
	private Date dataDeLacamento;
	
	private String destino;
	
	@Column(name = "data_de_aterrissagem")
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy")
	private Date dataDeAterrissagem;
	
	@Column(name = "vaiculo_de_lancamento")
	private String veiculoDeLancamento;
	
	private GalileoDto galileoDto;
	
	public MissaoDto() {
		// TODO Auto-generated constructor stub
	}

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

	public GalileoDto getGalileoDto() {
		return galileoDto;
	}

	public void setGalileoDto(GalileoDto galileoDto) {
		this.galileoDto = galileoDto;
	}

	@Override
	public String toString() {
		return "MissaoDto [id=" + id + ", dataDeLacamento=" + dataDeLacamento + ", destino=" + destino
				+ ", dataDeAterrissagem=" + dataDeAterrissagem + ", veiculoDeLancamento=" + veiculoDeLancamento
				+ ", galileoDto=" + galileoDto + "]";
	}
	
	
	
	
	
}
