package com.jsp.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jsp.dao.UsuarioDAO;

@WebServlet("/UsuarioControllerServlet")
public class UsuarioControllerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public UsuarioControllerServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
		
		String id = request.getParameter("id");
		String nome = request.getParameter("nome");
		String username = request.getParameter("username");
		String email = request.getParameter("email");
		String senha = request.getParameter("senha");
		 
		//Montar um novo objeto usuário
		//private UsuarioBean usuarioBean = new UsuarioBean();
		//usuarioBean.setId
		
		
	}

}
