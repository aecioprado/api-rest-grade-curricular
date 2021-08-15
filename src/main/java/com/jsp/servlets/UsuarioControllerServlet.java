package com.jsp.servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jsp.dao.UsuarioDAO;
import com.jsp.model.UsuarioBean;

@WebServlet("/UsuarioControllerServlet")
public class UsuarioControllerServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
	private UsuarioDAO usuarioDao = new UsuarioDAO();
       
    public UsuarioControllerServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//Intercepta os parametros do formulário.
		String id = request.getParameter("id");
		String nome = request.getParameter("nome");
		String username = request.getParameter("username");
		String email = request.getParameter("email");
		String senha = request.getParameter("senha");
		 
		//Montar um novo objeto usuário
		UsuarioBean usuario = new UsuarioBean();
		usuario.setId(id != null && !id.isEmpty() ? Long.parseLong(id) : null); // verifica, então, senão
		usuario.setNome(nome);
		usuario.setUsername(username);
		usuario.setEmail(email);
		usuario.setSenha(senha);
		
		//Grava no banco
		usuarioDao.salvar(usuario);
		
		request.setAttribute("mensagem", "Usuário cadastrado com sucesso.");
		request.setAttribute(username, usuario);
		request.getRequestDispatcher("principal/principal.jsp").forward(request, response);
		
		
	}

}
