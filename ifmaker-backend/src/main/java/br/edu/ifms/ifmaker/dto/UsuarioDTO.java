package br.edu.ifms.ifmaker.dto;

import java.io.Serializable;

import br.edu.ifms.ifmaker.entities.Usuario;

public class UsuarioDTO  implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private Long id;
	private String nome;
	private String email;
	private String senha;
	private Boolean administrador;
	
	public UsuarioDTO() { }

	public UsuarioDTO(Long id, String nome, String email, String senha, Boolean administrador) {
		this.id = id;
		this.nome = nome;
		this.email = email;
		this.senha = senha;
		this.administrador = administrador;
	}

	public UsuarioDTO(Usuario usuario) {
		this.id = usuario.getId();
		this.nome = usuario.getNome();
		this.email = usuario.getEmail();
		this.senha = usuario.getSenha();
		this.administrador = usuario.getAdministrador();
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

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public Boolean getAdministrador() {
		return administrador;
	}

	public void setAdministrador(Boolean administrador) {
		this.administrador = administrador;
	}

	
}


