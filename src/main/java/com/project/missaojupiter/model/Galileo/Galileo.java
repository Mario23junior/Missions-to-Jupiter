package com.project.missaojupiter.model.Galileo;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.project.missaojupiter.model.Juno.Juno;
import com.project.missaojupiter.model.pinner.Pinner;
import com.project.missaojupiter.model.voyager.Voyager;

@Entity
public class Galileo {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	private String nome;
	private String descricao;
	private String indentificacao;
	
	@Column(name = "duracao_da_miscao")
	private String duracaoDaMiscao;

	@OneToMany(mappedBy = "galileo", cascade = CascadeType.ALL)
	private List<Missao> missaos;

	@OneToMany(mappedBy = "galileo", cascade = CascadeType.ALL)
	private List<Propriedades> propriedades;

	@OneToMany(mappedBy = "galileo", cascade = CascadeType.ALL)
	private List<Juno> juno;

	@OneToMany(mappedBy = "galileo", cascade = CascadeType.ALL)
	private List<Pinner> pinner;

	@OneToMany(mappedBy = "galileo", cascade = CascadeType.ALL)
	private List<Voyager> voyager;

	public Galileo() {
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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

	public String getIndentificacao() {
		return indentificacao;
	}

	public void setIndentificacao(String indentificacao) {
		this.indentificacao = indentificacao;
	}

	public String getDuracaoDaMiscao() {
		return duracaoDaMiscao;
	}

	public void setDuracaoDaMiscao(String duracaoDaMiscao) {
		this.duracaoDaMiscao = duracaoDaMiscao;
	}

	public List<Missao> getMissaos() {
		return missaos;
	}

	public void setMissaos(List<Missao> missaos) {
		this.missaos = missaos;
	}

	public List<Propriedades> getPropriedades() {
		return propriedades;
	}

	public void setPropriedades(List<Propriedades> propriedades) {
		this.propriedades = propriedades;
	}

	public List<Juno> getJuno() {
		return juno;
	}

	public void setJuno(List<Juno> juno) {
		this.juno = juno;
	}

	public List<Pinner> getPinner() {
		return pinner;
	}

	public void setPinner(List<Pinner> pinner) {
		this.pinner = pinner;
	}

	public List<Voyager> getVoyager() {
		return voyager;
	}

	public void setVoyager(List<Voyager> voyager) {
		this.voyager = voyager;
	}

	

}
