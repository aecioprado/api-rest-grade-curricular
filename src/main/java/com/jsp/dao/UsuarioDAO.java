package com.jsp.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.jsp.model.UsuarioBean;
import com.jsp.util.SingleConnectionDb;

public class UsuarioDAO {

	private Connection connection;

	public UsuarioDAO() {
		connection = SingleConnectionDb.getConnection();
	}

	public UsuarioBean salvar(UsuarioBean usuario) throws SQLException {

		String sqlSalvar = "INSERT INTO usuarios(nome, username, email, senha) VALUES (?,?,?,?);";
		PreparedStatement ps = connection.prepareStatement(sqlSalvar);
		// Monta o objeto
		ps.setString(1, usuario.getNome());
		ps.setString(2, usuario.getUsername());
		ps.setString(3, usuario.getEmail());
		ps.setString(4, usuario.getSenha());

		ps.execute();
		connection.commit();

		return this.retornaUsuarioPorUsername(usuario.getUsername());

	}

	// Retorna o objeto usuario gravado no banco pelo login
	public UsuarioBean retornaUsuarioPorUsername(String username) throws SQLException {

		// Instancia um novo objeto usuario para ser montado
		UsuarioBean usuario = new UsuarioBean();

		String sqlRetornaUsuario = "SELECT * FROM usuarios where upper(username) = upper('" + username + "')";
		PreparedStatement ps = connection.prepareStatement(sqlRetornaUsuario);
		ResultSet rs = ps.executeQuery();

		// Itera o objeto result set para montar o usuario com os dados do banco
		while (rs.next()) {
			usuario.setId(rs.getLong("id"));
			usuario.setNome(rs.getString("nome"));
			usuario.setUsername(rs.getString("username"));
			usuario.setEmail(rs.getString("email"));
			usuario.setSenha(rs.getString("senha"));
		}

		return usuario;
	}

	public Boolean validaLoginExiste(String username) throws SQLException {

		String sqlValidaLoginExiste = "SELECT count(1) > 0 as exist FROM usuarios where upper(username) = upper('"
				+ username + "')";
		PreparedStatement ps = connection.prepareStatement(sqlValidaLoginExiste);
		ResultSet rs = ps.executeQuery();

		if (rs.next()) {
			return rs.getBoolean("existe");
		}

		return false;

	}


	public List<UsuarioBean> listaTodos() throws SQLException {
		
		List<UsuarioBean> lista = new ArrayList<>();

		String sqlListarTodos = "SELECT * FROM usuarios";
		
		PreparedStatement ps = connection.prepareStatement(sqlListarTodos);
		
		ResultSet rs = ps.executeQuery();
		
		while (rs.next()) {
            Long id = rs.getLong("id");
            String nome = rs.getString("nome");
            String username = rs.getString("username");
            String email = rs.getString("email");
            String senha = rs.getString("senha");

            lista.add(new UsuarioBean(id, nome, username, email, senha));
        }
		
		return lista;

	}

	

}
