package br.edu.ifms.ifmaker.dto;

import java.io.Serializable;
import java.security.Timestamp;

import br.edu.ifms.ifmaker.entities.Agendamento;
import br.edu.ifms.ifmaker.entities.Projeto;
import br.edu.ifms.ifmaker.entities.enums.Dia;

public class AgendamentoDTO  implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private Long id;
	private Timestamp data;
	private Dia diaAgenda;
	private Projeto projeto;
	
	public AgendamentoDTO() { }

	public AgendamentoDTO(Long id, Timestamp data, Dia diaAgenda, Projeto projeto) {
		this.id = id;
		this.data = data;
		this.diaAgenda = diaAgenda;
		this.projeto = projeto;
	}

	public AgendamentoDTO(Agendamento agendamento) {
		this.id = agendamento.getId();
		this.data = agendamento.getData();
		this.diaAgenda = agendamento.getDiaAgenda();
		this.projeto = agendamento.getProjeto();
	}
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Timestamp getData() {
		return data;
	}

	public void setData(Timestamp data) {
		this.data = data;
	}

	public Dia getDiaAgenda() {
		return diaAgenda;
	}

	public void setDiaAgenda(Dia diaAgenda) {
		this.diaAgenda = diaAgenda;
	}

	public Projeto getProjeto() {
		return projeto;
	}

	public void setProjeto(Projeto projeto) {
		this.projeto = projeto;
	}

	
}


