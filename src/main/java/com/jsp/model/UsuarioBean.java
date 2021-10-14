package com.jsp.model;

import java.io.Serializable;
import java.util.Objects;

public class UsuarioBean implements Serializable{
	
	private static final long serialVersionUID = -3185350123095042294L;
	private Long id;
	private String nome;
	private String username;
	private String email;
	private String senha;

	
	public UsuarioBean() {
		
	}
	
	


	public UsuarioBean(Long id, String nome, String username, String email, String senha) {
		this.id = id;
		this.nome = nome;
		this.username = username;
		this.email = email;
		this.senha = senha;
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


	public String getUsername() {
		return username;
	}


	public void setUsername(String username) {
		this.username = username;
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


	@Override
	public int hashCode() {
		return Objects.hash(email, id, nome, senha, username);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		UsuarioBean other = (UsuarioBean) obj;
		return Objects.equals(email, other.email) && Objects.equals(id, other.id) && Objects.equals(nome, other.nome)
				&& Objects.equals(senha, other.senha) && Objects.equals(username, other.username);
	}
	
	
	
	
}
