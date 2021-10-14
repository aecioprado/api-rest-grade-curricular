<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@page import="com.jsp.model.UsuarioBean" %>
<%@page import="com.jsp.dao.UsuarioDAO" %>
<%@page import="java.util.*" %>
	
<!DOCTYPE html>
<html>
<head>

<meta charset="ISO-8859-1">
<title>Principal</title>

<script
	src="<%=request.getContextPath()%>/resources/jquery/jquery-3.6.0.js"></script>
<!-- chamada do css -->
<link rel="stylesheet"
	href="<%=request.getContextPath()%>/resources/css/bootstrap.css">
<!-- chamada do js -->
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js"
	integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q"
	crossorigin="anonymous"></script>

<script
	src="<%=request.getContextPath()%>/resources/js/bootstrap.min.js"></script>
</head>
<body>
	<!-- tag semantica HEADER-->
	<jsp:include page="include-navbar.jsp"></jsp:include>

	<br />
	

		<div class="container border border-primary" style="width: 90%; padding: 0px;">
	<%
	
		UsuarioDAO usuarioDao = new UsuarioDAO();
	 	List<UsuarioBean> lista = usuarioDao.listaTodos();
	 	request.setAttribute("lista", lista);
	
	%>

				<table class="table">
				<thead class="table-success">
						<tr>
							<th scope="col">ID</th>
							<th scope="col">Nome</th>
							<th scope="col">Username</th>
							<th scope="col">E-mail</th>
							
							<th scope="col">Ações</th>
							
							
						</tr>
					</thead>
					<tbody>
					<c:forEach items='${lista}' var='l'>
						<tr>
							<td><c:out value="${l.id}"></c:out></td>
							<td><c:out value="${l.nome}"></c:out></td>
							<td><c:out value="${l.username}"></c:out></td>
							<td><c:out value="${l.email}"></c:out></td>
							<td>Editar | Excluir </td>
							
							
							</tr>
							</c:forEach>
					</tbody>
				</table>
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