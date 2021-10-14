<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<header>
		<!-- tag semantica NAV / barras de nevegacao-->
		<nav class="navbar navbar-expand-lg navbar-dark bg-primary">
			<!-- container default -->
			<div class="container">
				<ul class="navbar-nav mr-auto">
					<li class="nav-item nav-link">Usuário: <%=session.getAttribute("usuario")%></li>
					<li class="nav-item"><a class="nav-link"
						href="<%=request.getContextPath()%>/principal/mostrarUsuarios.jsp">Ver usuários</a></li>
					<li class="nav-item"><a class="nav-link"
						href="<%=request.getContextPath()%>/principal/cadastrarUsuario.jsp">Cadastrar</a></li>
					<li class="nav-item"><a class="nav-link"
						href="<%=request.getContextPath()%>/LoginServlet?acao=logout">Logout</a></li>
				</ul>
			</div>


		</nav>
	</header>