package com.jsp.model;

import java.io.Serializable;
import java.util.Objects;

public class LoginModel implements Serializable { // troca de dados cliente/servidor

	private static final long serialVersionUID = 2025114601657262972L;

	private String usuario;
	private String senha;

	public LoginModel() {

	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	@Override
	public int hashCode() {
		return Objects.hash(usuario, senha);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		LoginModel other = (LoginModel) obj;
		return Objects.equals(usuario, other.usuario) && Objects.equals(senha, other.senha);
	}

}
