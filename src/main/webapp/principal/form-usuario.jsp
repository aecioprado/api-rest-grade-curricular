<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

	<!-- Formulario Usuario -->
	<div class="container" style="width: 450px;">
		<div class="card" class="card border border-primary"
			style="background-color: rgb(229, 242, 251); padding: 10px;">
			
			

			<!-- Envia(Post) os dados para o UsuarioControllerServlet -->
			<form action="<%=request.getContextPath()%>/UsuarioControllerServlet" method="post" id="form-usuarios">
				<h2 class="card-title text-left">Formulário de usuário:</h2>
				
				<span>${mensagem}</span><br/>

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
					value="salvar">Salvar</button>
					
				<button type="submit" class="btn btn-login btn-success"
					value="salvar">Editar</button>
					
				<button type="submit" class="btn btn-login btn-success"
					value="salvar">Excluir</button>

				<button type="button" class="btn btn-login btn-success" value="novo"
					onclick="limparFormulario();">Limpar</button>
				
				<button type="button" class="btn btn-login btn-success" value="novo"
					onclick="limparFormulario();">Cancelar</button>


			</form>
		</div>	
		</div>
			<!-- Formulario Usuario -->