<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ page import = "	java.io.*,
					javax.servlet.*,
					classes.Carta,
					banco.CartaDAO" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Excluir uma carta</title>
</head>
<body>
	<%
		int id = Integer.parseInt(request.getParameter("id"));

		CartaDAO excluirCarta = new CartaDAO();

		excluirCarta.deletar(id);
		
		out.println("Objeto deletado!");
	%>
</body>
</html>