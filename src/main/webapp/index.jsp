<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<style>
body{background-color: lightblue};
</style>
<meta charset="ISO-8859-1">
<title>Login</title>
</head>
<body>
	
	<!-- card form -->
	<div id="card-central" style="display: flex; padding: 15px; align-items: center; justify-content: center; margin: 0 auto; background-color: white; width: 25%;">
		<form action="LoginServlet" method="post">
		<h1>Login</h1>
			<p>Usuario: <br/><input type="text" name="usuario"></p>
			<p>Senha: <br/><input type="password" name="senha"></p>
			<br /> 
			<button type="submit" value="enviar">Enviar</button>
			<button type="reset">Limpar</button>
			<br/>
			<p>${mensagem}</p>
		</form>
	</div>

</body>
</html>