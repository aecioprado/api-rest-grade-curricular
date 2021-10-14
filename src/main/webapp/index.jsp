<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="utf-8"%>
	
	<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Login</title>
    <!-- chamada do css -->
    <link rel="stylesheet" href="resources/css/bootstrap.css">
    <!-- chamada do js -->
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
    <script src="resources/jquery/jquery-3.6.0.js"></script>
    <script src="resources/js/bootstrap.min.js"></script>
</head>

<body>
    <br><br><br>

    <div class="container" id="login-form"  style="width: 350px;">

        <div class="card border border-primary" style="background-color: rgb(229, 242, 251); padding: 10px;"> 
            <!--form-->
            <form action="<%= request.getContextPath() %>/LoginServlet" method="post">
                <h2 class="card-title text-center">Login</h2>
                <div class="form-group">
                	<!-- parametro url -->
                    <input type="hidden" value="<%= request.getParameter("url") %>" name="url">
                    <input type="text" class="form-control" name="username" placeholder="usuário">
                </div>

                <div class="form-group">
                    
                    <input type="password" class="form-control" name="senha" placeholder="senha">
                </div>
                
                <span>${mensagem}</span>
                <br/>

                <button type="submit" class="btn btn-login btn-primary" value="enviar">Login</button>
                <br>
                <a href="<%= request.getContextPath() %>/registrodeusuario.jsp" title="Registre-se">Registre-se</a>
                <br>
                <a href="" title="Perdeu a senha">Recuperar senha</a>
            </form>
            <!--form -->
        </div>

    </div>


</body>

</html>