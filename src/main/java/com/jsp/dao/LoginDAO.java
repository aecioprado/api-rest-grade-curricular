package com.jsp.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.jsp.model.LoginModel;
import com.jsp.util.SingleConnectionDb;

public class LoginDAO {

	private Connection connection;

	public LoginDAO() {
		connection = SingleConnectionDb.getConnection();
	}

	public boolean validarAutenticacao(LoginModel loginModel) throws SQLException {

		String sql = "select * from login_model where usuario= ? and senha = ?";
		PreparedStatement pstmt = connection.prepareStatement(sql);
		pstmt.setString(1, loginModel.getUsuario());
		pstmt.setString(2, loginModel.getSenha());

		ResultSet rs = pstmt.executeQuery();

		if (rs.next()) {
			return true;
		} else {
			return false;
		}
	}
}
