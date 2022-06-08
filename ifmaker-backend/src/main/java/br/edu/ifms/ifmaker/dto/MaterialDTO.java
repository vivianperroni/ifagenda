package br.edu.ifms.ifmaker.dto;

import java.io.Serializable;

import br.edu.ifms.ifmaker.entities.Material;

public class MaterialDTO  implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private Long id;
	private String titulo;
	private String descricao;
	
	public MaterialDTO() { }

	public MaterialDTO(Long id, String titulo, String descricao) {
		this.id = id;
		this.titulo = titulo;
		this.descricao = descricao;
	}

	public MaterialDTO(Material material) {
		this.id = material.getId();
		this.titulo = material.getTitulo();
		this.descricao = material.getDescricao();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}	
	
	
}


