package br.edu.ifms.ifmaker.entities;

import java.io.Serializable;
import java.security.Timestamp;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import br.edu.ifms.ifmaker.entities.enums.Dia;

@Entity
@Table(name = "tb_agendamento")
public class Agendamento implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private Timestamp data;
	@Enumerated(value = EnumType.STRING)
	private Dia diaAgenda;
	@JsonIgnore
	@ManyToOne
	@JoinColumn(name = "id_projeto")
	private Projeto projeto;
	
	public Agendamento() { }

	public Agendamento(Long id, Timestamp data, Dia diaAgenda, Projeto projeto) {
		this.id = id;
		this.data = data;
		this.diaAgenda = diaAgenda;
		this.projeto = projeto;
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
	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Agendamento other = (Agendamento) obj;
		return Objects.equals(id, other.id);
	}
	
	
}
