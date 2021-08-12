package com.jsp.servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jsp.dao.LoginDAO;
import com.jsp.model.UsuarioBean;

//@WebServlet => @Controller
@WebServlet("/LoginServlet") // mapeamento
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private LoginDAO loginDAO = new LoginDAO();

	public LoginServlet() {
		super();
	}

	// SERVLET -> GET
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	// recebe os dados enviados por um formul�rio
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);

		// recebem os valores passados pelo formul�rio
		String username = request.getParameter("username");
		String senha = request.getParameter("senha");
		String url = request.getParameter("url");
		
		// verifica se o login � valido
		try {
			if (username != null && !username.isEmpty() && senha != null && !senha.isEmpty()) {
				
				// cria um novo objeto do tipo LoginModel
				UsuarioBean usuario = new UsuarioBean();
				// seta usu�rio passado pela formul�rio
				usuario.setUsername(username);
				// seta senha passada pelo formul�rio
				usuario.setSenha(senha);

				// caso seja valido, verifica se � usuario e senha - admin
				if (loginDAO.validarAutenticacao(usuario)) {

					// cria session para o usuario
					request.getSession().setAttribute("usuario", usuario.getUsername());

					// valida redirecionamento
					if (url == null || url.equals("null")) {
						url = "principal/principal.jsp";
					}

					// redireciona para a pagina correta
					RequestDispatcher redirecionar = request.getRequestDispatcher(url);
					redirecionar.forward(request, response);

				} else {
					RequestDispatcher redirecionar = request.getRequestDispatcher("/index.jsp");
					request.setAttribute("mensagem", "Usuario e/ou senha est�o incorretos.");
					redirecionar.forward(request, response);
				}

			} else {
				RequestDispatcher redirecionar = request.getRequestDispatcher("index.jsp");
				request.setAttribute("mensagem", "Usuario e/ou senha est�o em branco.");
				redirecionar.forward(request, response);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
