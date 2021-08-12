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
<title>Principal</title>
</head>
<body>

	<h1>Página Principal</h1>
	<br/>
	<br/>
	<%= session.getAttribute("username") %>
	<a ref="">Listar Usuários</a> | <a href=""></a>

</body>
</html>