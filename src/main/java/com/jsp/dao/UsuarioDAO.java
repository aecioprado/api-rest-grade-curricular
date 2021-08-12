package com.jsp.dao;

import java.sql.Connection;

import com.jsp.model.UsuarioBean;
import com.jsp.util.SingleConnectionDb;

public class UsuarioDAO {

	private Connection connection;

	public UsuarioDAO() {
		connection = SingleConnectionDb.getConnection();
	}

	public void salvar(UsuarioBean usuario) {

	}

	public void atualizar(UsuarioBean usuario) {

	}

	public void deletar(UsuarioBean usuario) {

	}

	public void listarTodos(UsuarioBean usuario) {

	}

	public void listarPorId(UsuarioBean usuario) {

	}

}
