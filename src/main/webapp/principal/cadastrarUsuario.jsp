<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
	
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
	
	<jsp:include page="form-usuario.jsp"></jsp:include>

			
	<!-- Modal -->
	<div class="modal fade" id="modal-pesquisar" tabindex="-1"
		role="dialog" aria-labelledby="exampleModalLabel" aria-hidden="true">
		<div class="modal-dialog" role="document">
			<div class="modal-content">
				<div class="modal-header">
					<h5 class="modal-title" id="exampleModalLabel">Pesquisa de
						usuários</h5>
					<button type="button" class="close" data-dismiss="modal"
						aria-label="Close">
						<span aria-hidden="true">&times;</span>
					</button>
				</div>
				<div class="modal-body">
					<div class="input-group mb-3">
						<input type="text" class="form-control"
							placeholder="nome do usuário" aria-label="Recipient's username"
							aria-describedby="basic-addon2">

						<div class="input-group-append">
							<button class="btn btn-login btn-success" type="button">Buscar</button>
						</div>

					</div>

				</div>

				<table class="table">
					<thead>
						<tr>
							<th scope="col">ID</th>
							<th scope="col">Nome</th>
							<th scope="col">Username</th>
							<th scope="col">Ações</th>
						</tr>
					</thead>
					<tbody>
						<tr>
							<td>1</td>
							<td>Jose</td>
							<td>jaecio</td>
							<td><button type="button" class="btn btn-secondary"
									data-dismiss="modal">Editar</button>
								<button type="button" class="btn btn-secondary"
									data-dismiss="modal">Excluir</button></td>
						</tr>

					</tbody>
				</table>

				<div class="modal-footer">
					<button type="button" class="btn btn-secondary"
						data-dismiss="modal">Fechar</button>
				</div>
			</div>
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