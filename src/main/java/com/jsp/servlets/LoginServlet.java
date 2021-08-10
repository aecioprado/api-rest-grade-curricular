package com.jsp.servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jsp.model.LoginModel;

//@WebServlet => @Controller
@WebServlet("/LoginServlet") // mapeamento
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public LoginServlet() {
		super();
	}

	// SERVLET -> GET
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	// recebe os dados enviados por um formulário
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
		
		// recebem valores passados pelo form
		String usuario = request.getParameter("usuario");
		String senha = request.getParameter("senha");
		String url = request.getParameter("url");

		// Validação para fazer o post

		// verifica se o login é valido
		if (usuario != null && !usuario.isEmpty() && senha != null && !senha.isEmpty()) {

			LoginModel loginModel = new LoginModel();
			loginModel.setUsuario(usuario);
			loginModel.setSenha(senha);

			// caso seja valido, verifica se é usuario e senha - admin
			if (loginModel.getUsuario().equalsIgnoreCase("admin") && loginModel.getSenha().equalsIgnoreCase("admin")) {

				// cria session para o usuario
				request.getSession().setAttribute("usuario", loginModel.getUsuario());

				// valida redirecionamento
				if (url == null || url.equals("null")) {
					url = "principal/principal.jsp";
				}

				// redireciona para a pagina correta
				RequestDispatcher redirecionar = request.getRequestDispatcher(url);
				redirecionar.forward(request, response);

			} else {
				RequestDispatcher redirecionar = request.getRequestDispatcher("/index.jsp");
				request.setAttribute("mensagem", "Usuario e/ou senha estão incorretos.");
				redirecionar.forward(request, response);
			}

		} else {
			RequestDispatcher redirecionar = request.getRequestDispatcher("index.jsp");
			request.setAttribute("mensagem", "Usuario e/ou senha estão em branco.");
			redirecionar.forward(request, response);
		}

	}

}
