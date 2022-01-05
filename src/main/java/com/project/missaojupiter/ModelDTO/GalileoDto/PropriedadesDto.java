package com.project.missaojupiter.ModelDTO.GalileoDto;

import javax.persistence.Column;

public class PropriedadesDto {

	private Long id;

	private String fabricante;
	private String orbitador;
	private String aterrissador;
	
	@Column(name = "gerador_de_energia")
	private String geradorDeEnergia;
	
	@Column(name = "massa_de_carga_util")
	private String massaDeCargaUtil;

	public PropriedadesDto() {
		
	}

	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getFabricante() {
		return fabricante;
	}

	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}

	public String getOrbitador() {
		return orbitador;
	}

	public void setOrbitador(String orbitador) {
		this.orbitador = orbitador;
	}

	public String getAterrissador() {
		return aterrissador;
	}

	public void setAterrissador(String aterrissador) {
		this.aterrissador = aterrissador;
	}

	public String getGeradorDeEnergia() {
		return geradorDeEnergia;
	}

	public void setGeradorDeEnergia(String geradorDeEnergia) {
		this.geradorDeEnergia = geradorDeEnergia;
	}

	public String getMassaDeCargaUtil() {
		return massaDeCargaUtil;
	}

	public void setMassaDeCargaUtil(String massaDeCargaUtil) {
		this.massaDeCargaUtil = massaDeCargaUtil;
	}

	
}
