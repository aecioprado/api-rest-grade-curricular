package com.jsp.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.jsp.model.UsuarioBean;
import com.jsp.util.SingleConnectionDb;

public class UsuarioDAO {

	private Connection connection;

	public UsuarioDAO() {
		connection = SingleConnectionDb.getConnection();
	}

	public void salvar(UsuarioBean usuario) {
		try {
		String sqlSalvar = "INSERT INTO usuarios(nome, username, email, senha) VALUES (?,?,?,?);";
		PreparedStatement ps = connection.prepareStatement(sqlSalvar);
		//Monta o objeto
		ps.setString(1,usuario.getNome());
		ps.setString(2, usuario.getUsername());
		ps.setString(3, usuario.getEmail());
		ps.setString(4, usuario.getSenha());
		
		ps.execute();
		connection.commit();
		} catch(Exception e) {
			e.printStackTrace();
		}
		
	}

	public void atualizar(UsuarioBean usuario) {
		
		String sqlAtual = "INSERT INTO usuarios (nome, username, email, senha) VALUES (?,?,?,?);";
		
		String sqlAtualizado = "INSERT INTO usuarios (nome, username, email, senha) VALUES (?,?,?,?);";

	}

	public void deletar(UsuarioBean usuario) {
		
		String sqlDeletar = "INSERT INTO usuarios (nome, username, email, senha) VALUES (?,?,?,?);";

	}

	public void listarTodos(UsuarioBean usuario) {
		
		String sqlListarTodos = "INSERT INTO usuarios (nome, username, email, senha) VALUES (?,?,?,?);";

	}

	public void listarPorId(UsuarioBean usuario) {
		
		String sqlListarPorId = "INSERT INTO usuarios (nome, username, email, senha) VALUES (?,?,?,?);";

	}

}
