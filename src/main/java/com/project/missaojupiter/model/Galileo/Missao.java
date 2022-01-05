package com.project.missaojupiter.model.Galileo;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Missao {
   
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Column(name = "data_de_lancamento")
	private Date dataDeLacamento;
	
	private String destino;
	
	@Column(name = "data_de_aterrissagem")
	private Date dataDeAterrissagem;
	
	@Column(name = "vaiculo_de_lancamento")
	private String veiculoDeLancamento;
	
    @ManyToOne
    private Galileo galileo;
	
    
	public Galileo getGalileo() {
		return galileo;
	}
	public void setGalileo(Galileo galileo) {
		this.galileo = galileo;
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
	
}
