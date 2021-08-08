package com.jsp.entity;

import java.io.Serializable;
import java.util.Objects;

public class LoginEntity implements Serializable { // troca de dados cliente/servidor

	private static final long serialVersionUID = 2025114601657262972L;

	private String login;
	private String senha;

	public LoginEntity() {

	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	@Override
	public int hashCode() {
		return Objects.hash(login, senha);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		LoginEntity other = (LoginEntity) obj;
		return Objects.equals(login, other.login) && Objects.equals(senha, other.senha);
	}

}
