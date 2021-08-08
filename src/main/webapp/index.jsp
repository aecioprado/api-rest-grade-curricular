<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<style>
body{background-color: lightblue};
</style>
<meta charset="ISO-8859-1">
<title>Form</title>
</head>
<body>
	


	<div id="card-central" style="display: flex; padding: 15px; align-items: center; justify-content: center; margin: 0 auto; background-color: white; width: 25%;">
		<form action="receber-nome.jsp">
		<h1>Formulário</h1>
			<p>Nome: <br/><input type="text" name="nome"></p> <!-- //name = receber o nome do parametro -->
			<p>Idade: <br/><input type="text" name="idade"></p>
			<br /> 
			<button type="submit" value="enviar">Enviar</button>
			<button type="reset">Limpar</button>
		</form>
	</div>

</body>
</html>