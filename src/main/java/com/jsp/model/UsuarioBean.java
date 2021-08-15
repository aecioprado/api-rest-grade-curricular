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
	private String confirmaSenha;
	
	public UsuarioBean() {
		
	}
	
	
	
	public UsuarioBean(String nome, String username, String email, String senha, String confirmaSenha) {
		this.nome = nome;
		this.username = username;
		this.email = email;
		this.senha = senha;
		this.confirmaSenha = confirmaSenha;
	}



	public Boolean validaSenha(String senha, String confirmaSenha) {
		this.senha = senha;
		this.confirmaSenha = confirmaSenha;
		
		if(senha.equalsIgnoreCase(confirmaSenha)) {
			return true;
		}
		 return false;
	}
	
	public Boolean validaLogin(String username, String senha) {
		this.username = username;
		this.senha = senha;
		
		if(username.equalsIgnoreCase(senha)) {
			return true;
		}
		return false;
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



	public String getConfirmaSenha() {
		return confirmaSenha;
	}



	public void setConfirmaSenha(String confirmaSenha) {
		this.confirmaSenha = confirmaSenha;
	}



	public Long getId() {
		return id;
	}



	@Override
	public int hashCode() {
		return Objects.hash(confirmaSenha, email, id, nome, senha, username);
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
		return Objects.equals(confirmaSenha, other.confirmaSenha) && Objects.equals(email, other.email)
				&& Objects.equals(id, other.id) && Objects.equals(nome, other.nome)
				&& Objects.equals(senha, other.senha) && Objects.equals(username, other.username);
	}



	@Override
	public String toString() {
		return "UsuarioBean [id=" + id + ", nome=" + nome + ", username=" + username + ", email=" + email + ", senha="
				+ senha + ", confirmaSenha=" + confirmaSenha + "]";
	}
	
	
	
}
