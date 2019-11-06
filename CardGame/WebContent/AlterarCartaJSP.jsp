<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ page
	import="	java.io.*,
					javax.servlet.*,
					classes.Carta,
					banco.CartaDAO"%>

<!DOCTYPE html>
<html>

<head>
<meta charset="ISO-8859-1">
<title>Editar uma carta</title>
</head>

<body>
	<%
		int idCarta = Integer.parseInt(request.getParameter("id"));
		String nomeCarta = request.getParameter("nomeCarta"); //nome do input.
		int mana = Integer.parseInt(request.getParameter("mana"));
		String imagem = request.getParameter("imagem");
		String iconIMG = request.getParameter("iconIMG");
		String tipoDaCarta = request.getParameter("tipoDaCarta");
		int ataque = Integer.parseInt(request.getParameter("ataque"));
		int defesa = Integer.parseInt(request.getParameter("defesa"));
		String cartaDescricao = request.getParameter("cartaDescricao");
		String falaFavorita = request.getParameter("falaFavorita");

		Carta carta1 = new Carta();
		CartaDAO editarCarta = new CartaDAO();
	%>
	<br>
	<form action="AlterarCartaJSP1.jsp" method="post">
	<br><input name="id" class="form-control" placeholder=${param.id } type="text">
	<br><input name="nomeCarta" class="form-control" placeholder=${param.nomeCarta } type="text">
	<br><input name=mana class="form-control" placeholder=${param.mana } type="text">
	<br><input name="imagem" class="form-control" placeholder=${param.imagem } type="text">
	<br><input name="iconIMG" class="form-control" placeholder=${param.iconIMG } type="text">
	<br><input name="tipoDaCarta" class="form-control" placeholder=${param.tipoDaCarta } type="text">
	<br><input name="ataque" class="form-control" placeholder=${param.ataque } type="text">
	<br><input name="defesa" class="form-control" placeholder=${param.defesa } type="text">
	<br><input name="cartaDescricao" class="form-control" placeholder=${param.cartaDescricao } type="text">
	<br><input name="falaFavorita" class="form-control" placeholder=${param.falaFavorita } type="text">
	<br><button type="submit" class="btn btn-primary btn-block btn-dark"> Entrar </button>
	</form>
</body>

</html>