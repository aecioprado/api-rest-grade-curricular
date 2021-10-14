<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>

<meta charset="ISO-8859-1">
<title>Principal</title>

<script src="<%= request.getContextPath() %>/resources/jquery/jquery-3.6.0.js"></script>
<!-- chamada do css -->
<link rel="stylesheet" href="<%= request.getContextPath() %>/resources/css/bootstrap.css">
<!-- chamada do js -->
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js"
	integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q"
	crossorigin="anonymous"></script>

<script src="<%= request.getContextPath() %>/resources/js/bootstrap.min.js"></script>
</head>
<body>
	<!-- tag semantica HEADER-->
	<header>
		<!-- tag semantica NAV / barras de nevegacao-->
		<nav class="navbar navbar-expand-lg navbar-dark bg-primary">
			<!-- container default -->
			<div class="container">
				<ul class="navbar-nav mr-auto">
					<li class="nav-item">Bem-vindo, <%=session.getAttribute("usuario")%></li>
					<li class="nav-item"><a class="nav-link"
						href="<%=request.getContextPath()%>/LoginServlet?acao=logout">Logout</a></li>
				</ul>
			</div>


		</nav>
	</header>

	<br />
	<div class="container" style="width: 450px;">
		<div class="card" class="card border border-primary"
			style="background-color: rgb(229, 242, 251); padding: 10px;">

			<!-- Envia(Post) os dados para o UsuarioControllerServlet -->
			<form action="<%=request.getContextPath()%>/UsuarioControllerServlet"
				method="post" id="form-usuarios">
				<h2 class="card-title text-center">Cadastro de usuário</h2>

				<div class="form-group">
					<label>Id:</label><br /> <input type="text" class="form-control"
						name="id" id="id" readonly="readonly" value="${usuarioForm.id}">
				</div>

				<div class="form-group">
					<label>Nome:</label><br /> <input type="text" class="form-control"
						name="nome" id="nome" autocomplete="off" required="required"
						value="${usuarioForm.nome}">
				</div>

				<div class="form-group">
					<label>Username:</label><br /> <input type="text"
						class="form-control" name="username" id="username"
						autocomplete="off" required="required"
						value="${usuarioForm.username}">
				</div>

				<div class="form-group">
					<label>E-mail:</label><br /> <input type="text"
						class="form-control" name="email" id="email" autocomplete="off"
						required="required" value="${usuarioForm.email}">
				</div>

				<div class="form-group">
					<label>Senha:</label><br /> <input type="password"
						class="form-control" name="senha" id="senha" autocomplete="off"
						required="required" value="${usuarioForm.senha}">
				</div>

				<button type="submit" class="btn btn-login btn-success"
					value="salvar">Enviar</button>
				
					<span>${mensagem}</span>

			</form>
			
			

		</div>
	</div>

	

	<script>
		function limparFormulario() {
			var campos = document.getElementById("form-usuarios").elements;

			for (i = 0; i < campos.length; i++) {
				campos[i].value = "";
			}
		}
	</script>

</body>
</html>