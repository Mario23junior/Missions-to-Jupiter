package com.project.missaojupiter.ModelDTO.GalileoDto;

public class PropriedadesDto {

	private String fabricante;
	private Double orbitador;
	private Double aterrissador;
	private String geradorDeEnergia;
	private String massaDeCargaUtil;

	public PropriedadesDto() {
	}

	public String getFabricante() {
		return fabricante;
	}

	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}

	public Double getOrbitador() {
		return orbitador;
	}

	public void setOrbitador(Double orbitador) {
		this.orbitador = orbitador;
	}

	public Double getAterrissador() {
		return aterrissador;
	}

	public void setAterrissador(Double aterrissador) {
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