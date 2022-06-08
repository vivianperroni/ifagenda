package br.edu.ifms.ifmaker.dto;

import java.io.Serializable;
import java.util.List;

import br.edu.ifms.ifmaker.entities.Agendamento;
import br.edu.ifms.ifmaker.entities.Projeto;

public class ProjetoDTO  implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private Long id;
	private String titulo;
	private String descricao;
	private List<Agendamento> agendamento;
	
	public ProjetoDTO() { }

	public ProjetoDTO(Long id, String titulo, String descricao, List<Agendamento> agendamento) {
		this.id = id;
		this.titulo = titulo;
		this.descricao = descricao;
		this.agendamento = agendamento;
	}

	public ProjetoDTO(Projeto projeto) {
		this.id = projeto.getId();
		this.titulo = projeto.getTitulo();
		this.descricao = projeto.getDescricao();
		this.agendamento = projeto.getAgendamento();
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

	public List<Agendamento> getAgendamento() {
		return agendamento;
	}

	public void setAgendamento(List<Agendamento> agendamento) {
		this.agendamento = agendamento;
	}


	
}


