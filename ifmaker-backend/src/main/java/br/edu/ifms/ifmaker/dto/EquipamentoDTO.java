package br.edu.ifms.ifmaker.dto;

import java.io.Serializable;

import br.edu.ifms.ifmaker.entities.Equipamento;

public class EquipamentoDTO  implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private Long id;
	private String titulo;
	private String patrimonio;
	private String descricao;
	
	public EquipamentoDTO() { }

	public EquipamentoDTO(Long id, String titulo, String patrimonio, String descricao) {
		this.id = id;
		this.titulo = titulo;
		this.patrimonio = patrimonio;
		this.descricao = descricao;
	}

	public EquipamentoDTO(Equipamento equipamento) {
		this.id = equipamento.getId();
		this.titulo = equipamento.getTitulo();
		this.patrimonio = equipamento.getPatrimonio();
		this.descricao = equipamento.getDescricao();
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

	public String getPatrimonio() {
		return patrimonio;
	}

	public void setPatrimonio(String patrimonio) {
		this.patrimonio = patrimonio;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}	
	
	
}


