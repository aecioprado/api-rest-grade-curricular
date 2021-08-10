package com.jsp.filter;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import com.jsp.util.SingleConnectionDb;

// intercepta todas as requisicoes que passam pela(s) url(s) definidas(s).
// index não passa pela filtro
// considere "principal" = "home"
@WebFilter(urlPatterns = { "/principal/*" })
public class FilterAutenticacao implements Filter {
	
	public static Connection connection;

	public FilterAutenticacao() {
		
		
	}

	// encerra os processos quando o servidor é parado (shutdown)
	public void destroy() {
		try {
			connection.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	// intercepta as requisicoes e as respostas no sistema a partir da url mapeada.
	// Exemplo:
	// validação de autenticação
	// realizar commit e rollback de transação no banco de dados.
	// validar e fazer redirecionamento de paginas
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		
		// inicio try
		try {

			HttpServletRequest req = (HttpServletRequest) request;
			HttpSession session = req.getSession();

			String usuarioLogado = (String) session.getAttribute("usuario");

			String urlParaAutenticar = req.getServletPath();

			// validar se usuario esta logado, senão redireciona para tela de login

			if (usuarioLogado == null && !urlParaAutenticar.contains("/principal/LoginServlet")) { //usuario nao logado

				RequestDispatcher redireciona = request.getRequestDispatcher("/index.jsp?url=" + urlParaAutenticar);
				request.setAttribute("mensagem", "Por favor, realize o login.");
				redireciona.forward(request, response);
				return; // para a execuação e redireciona para o login
			} else {
				chain.doFilter(request, response);
			}
			
			connection.commit();
			
			
		} catch (Exception e) {
			e.printStackTrace();
			try {
				connection.rollback();
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
		}
		// fim do try
	}

	// inicia os processos ou recursos quando o servidor sobe o projeto.
	// Também inicia a conexao com banco de dados
	public void init(FilterConfig fConfig) throws ServletException {
		
		connection = SingleConnectionDb.getConnection();

	}

}
