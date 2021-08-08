<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<style>
body{background-color: lightblue};
</style>
<meta charset="ISO-8859-1">
<title>Receber nome </title>
</head>
<body>
	
	<div id="card-central" style="display: flex; padding: 15px; align-items: center; justify-content: center; margin: 0 auto; background-color: white; width: 25%;">
	<%
	// obtem parametro passado na url -> request.getParameter
	String nome = request.getParameter("nome");
	out.print("nome: "+nome);
	%>
	<br/>
	<%
	String idade =  request.getParameter("idade");
	out.print("idade: "+idade);
	%>
</div>

</body>
</html>