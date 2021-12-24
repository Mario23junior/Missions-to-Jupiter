package com.project.missaojupiter.Dto.GalileoDto;

public class GalileoDto {

	private Long id;
	private String nome;
	private String descricao;
	private String indentificacao;
	private String duracaoDaMiscao;

	public GalileoDto() {
		
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

}
