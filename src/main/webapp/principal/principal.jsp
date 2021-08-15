<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>

<meta charset="ISO-8859-1">
<title>Principal</title>

<!-- chamada do css -->
<link rel="stylesheet" href="resources/css/bootstrap.css">
<!-- chamada do js -->
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js"
	integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q"
	crossorigin="anonymous"></script>
<script src="resources/jquery/jquery-3.6.0.js"></script>
<script src="resources/js/bootstrap.min.js"></script>
</head>
<body>
	<!-- tag semantica HEADER-->
	<header>
		<!-- tag semantica NAV / barras de nevegacao-->
		<nav class="navbar navbar-expand-lg navbar-dark bg-primary">
			<!-- container default -->
			<div class="container">
				<a class="navbar-brand h1 mb-0" href="<%= request.getContextPath() %>/principal/usuario-cadastro.jsp">Usuário</a>
				

			</div>


		</nav>
	</header>

<br/>
	<div class="container" style="width: 450px;">
	<div class="card" class="card border border-primary" style="background-color: rgb(229, 242, 251); padding: 10px;">
		
		<!-- Envia(Post) os dados para o UsuarioControllerServlet -->
		<form action="<%=request.getContextPath() %>/UsuarioControllerServlet" method="post">
			<h2 class="card-title text-center">Cadastro de usuário</h2>
			
			<div class="form-group">
			<label>Id:</label><br/>
			<input type="text" class="form-control" name="id" id="id" readonly="readonly">
			</div>
			
			<div class="form-group">
			<label>Nome:</label><br/>
			<input type="text" class="form-control" name="nome" id="nome" autocomplete="off" required="required">
			</div>
			
			<div class="form-group">
			<label>Username:</label><br/>
			<input type="text" class="form-control" name="username" id="username" autocomplete="off" required="required">
			</div>
			
			<div class="form-group">
			<label>E-mail:</label><br/>
			<input type="text" class="form-control" name="email" id="email" autocomplete="off" required="required">
			</div>
			
			<div class="form-group">
			<label>Senha:</label><br/>
			<input type="password" class="form-control" name="senha" id="senha" autocomplete="off" required="required">
			</div>
			

			<button type="submit" class="btn btn-login btn-success"
				value="novo">Novo</button>
				
			<button type="submit" class="btn btn-login btn-success"
				value="salvar">Salvar</button>
			
			<button type="submit" class="btn btn-login btn-success"
				value="editar">Editar</button>
			
			<button type="submit" class="btn btn-login btn-danger"
				value="deletar">Deletar</button>
			
			<button type="reset" class="btn btn-login btn-success"
				value="salvar">Limpar</button>
		</form>
		</div>
	</div>

</body>
</html>