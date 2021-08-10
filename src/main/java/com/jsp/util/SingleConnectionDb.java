package com.jsp.util;

import java.sql.Connection;
import java.sql.DriverManager;

public class SingleConnectionDb {

	private static String dbUrl = "jdbc:postgresql://localhost:5432/jsp_login_crud?"; // !!!!!
	private static String user = "postgres";
	private static String pwd = "admin123";
	private static Connection connection = null;

	static {
		conectar();
	}

	// construtor
	public SingleConnectionDb() {
		conectar();
	}

	// método privado
	private static void conectar() {

		try {

			// verifica se já existe uma conexão ativa
			if (connection == null) {
				Class.forName("org.postgresql.Driver");
				connection = DriverManager.getConnection(dbUrl, user, pwd);
				connection.setAutoCommit(false);

			}

		} catch (Exception e) {
			e.printStackTrace();
		} 
	}

	// para retornar a conexao existente
	public static Connection getConnection() {

		return connection;

	}
}
