package com.jsp.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionDb {

	private static String dbUrl = "jdbc:postgresql//localhost:53714/jsp_login_crud";
	private static String user = "postgres";
	private static String pwd = "admindb";
	private static Connection conn = null;

	// para retornar a conexao existente
	public static Connection getConnection() {

		try {

			try {
				Class.forName("org.postgresql.Driver");
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}
			return DriverManager.getConnection(dbUrl, user, pwd);

		} catch (SQLException e) {
			throw new RuntimeException(e);
		}

	}
}
