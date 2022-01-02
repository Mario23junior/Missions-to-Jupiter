package com.project.missaojupiter.model.Galileo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Propriedades {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String fabricante;
	private String orbitador;
	private String aterrissador;
	private String geradorDeEnergia;
	private String massaDeCargaUtil;
	
	 @ManyToOne
	 Galileo galileo;

	public Propriedades() {
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

	public Galileo getGalileo() {
		return galileo;
	}

	public void setGalileo(Galileo galileo) {
		this.galileo = galileo;
	}
	

}
