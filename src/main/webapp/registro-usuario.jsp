<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<style>
body {
	background-color: lightblue
}
;
</style>
<meta charset="ISO-8859-1">
<title>Cadastro de usuário</title>
</head>
<body>
<form action="UsuarioControllerServlet" method="post">
<h1>Cadastro de usuário:</h1>
	<table id="card-central"
		style="display: flex; padding: 15px; align-items: center; justify-content: center; margin: 0 auto; background-color: white; width: 25%;">
		<tr>
			<td>Nome:</td>
			<td><input type="text" name="nome"></td>
		</tr>
		<tr>
			<td>Username:</td>
			<td><input type="text" name="username"></td>
		</tr>
		<tr>
			<td>E-mail:</td>
			<td><input type="text" name="email"></td>
		</tr>
		<tr>
			<td>Senha:</td>
			<td><input type="password" name="senha"></td>
		</tr>
		<tr>
			<td>Confirma Senha:</td>
			<td><input type="password" name="confirmasenha"></td>
		</tr>
	
	</table>
	<br />
	<button type="submit" value="enviar">Enviar</button>
	<button type="reset">Limpar</button>
</form>

</body>
</html>