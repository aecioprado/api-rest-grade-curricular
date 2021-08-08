package com.jsp.servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jsp.entity.LoginEntity;

// Um servlet é um Controller
@WebServlet("/LoginServlet") // mapeamento
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public LoginServlet() {
		super();
	}

	// recebe os dados pela url em parametros
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	// recebe os dados enviados por um formulario
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);

		String usuario = (request.getParameter("usuario"));
		String senha = (request.getParameter("senha"));

		// Validação
		// Verifica se os parametros não são nulos nem vazios
		if (usuario != null && !usuario.isEmpty() && senha != null && !senha.isEmpty()) {

			LoginEntity loginEntity = new LoginEntity();
			loginEntity.setLogin(usuario);
			loginEntity.setSenha(senha);

		} else {
			RequestDispatcher redirecionar = request.getRequestDispatcher("index.jsp");
			request.setAttribute("mensagem", "Informe usuario e senha corretamente");
			redirecionar.forward(request, response);
		}

	}

}
