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

import com.jsp.util.ConnectionDb;

@WebFilter(urlPatterns = { "/principal/*" }) // mapeia todas as requisições a partir de "/principal/*"
public class FilterAutenticacao implements Filter {

	public FilterAutenticacao() {
	}

	// encerra os processos quando o servidor é parado
	public void destroy() {

	}

	// intercepta as requisicoes e as respostas no sistemas
	// validação de autenticação
	// realizar commit e rollback de transação no banco
	// validar e fazer redirecionamento de paginas
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {

		try {

			HttpServletRequest req = (HttpServletRequest) request;
			HttpSession session = req.getSession();

			String usuarioLogado = (String) session.getAttribute("usuario");

			String urlParaAutenticar = req.getServletPath(); // url que esta sendo acessada

			// validar se usuario esta logado senao redireciona para login

			if (usuarioLogado == null && !urlParaAutenticar.contains("/principal/LoginServlet")) {

				RequestDispatcher redireciona = request.getRequestDispatcher("/index.jsp?url=" + urlParaAutenticar);
				request.setAttribute("mensagem", "Por favor, realize o login.");
				redireciona.forward(request, response);
				return; // para a execuação e redireciona para o login
			} else {
				chain.doFilter(request, response);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// inicia os processos ou recursos quando o servidor sobre o projeto.
	// inicia a conexao com banco de dados
	public void init(FilterConfig fConfig) throws ServletException {

	}

}
