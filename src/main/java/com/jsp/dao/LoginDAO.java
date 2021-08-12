package com.jsp.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.jsp.model.UsuarioBean;
import com.jsp.util.SingleConnectionDb;

public class LoginDAO {

	private Connection connection;

	public LoginDAO() {
		connection = SingleConnectionDb.getConnection();
	}

	public boolean validarAutenticacao(UsuarioBean usuario) throws SQLException {

		String sql = "select * from usuarios where usuario= ? and senha = ?";
		PreparedStatement ps = connection.prepareStatement(sql);
		ps.setString(1, usuario.getUsername());
		ps.setString(2, usuario.getSenha());

		ResultSet rs = ps.executeQuery();

		if (rs.next()) {
			return true;
		} else {
			return false;
		}
	}
}
