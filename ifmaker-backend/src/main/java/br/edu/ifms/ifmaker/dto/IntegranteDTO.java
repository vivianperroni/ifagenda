package br.edu.ifms.ifmaker.dto;

import java.io.Serializable;

import br.edu.ifms.ifmaker.entities.Integrante;

public class IntegranteDTO  implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private Long id;
	private String nome;
	private String email;
	private String telefone;
	private Boolean coordenador;
	
	public IntegranteDTO() { }

	public IntegranteDTO(Long id, String nome, String email, String telefone, Boolean coordenador) {
		this.id = id;
		this.nome = nome;
		this.email = email;
		this.telefone = telefone;
		this.coordenador = coordenador;
	}

	public IntegranteDTO(Integrante integrante) {
		this.id = integrante.getId();
		this.nome = integrante.getNome();
		this.email = integrante.getEmail();
		this.telefone = integrante.getTelefone();
		this.coordenador = integrante.getCoordenador();
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public Boolean getCoordenador() {
		return coordenador;
	}

	public void setCoordenador(Boolean coordenador) {
		this.coordenador = coordenador;
	}

	
}


