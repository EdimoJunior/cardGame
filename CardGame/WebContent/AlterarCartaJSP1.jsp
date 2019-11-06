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
<title>Alterar Carta</title>
</head>
<body>
	<%
		int idCarta = Integer.parseInt(request.getParameter("idCarta"));
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
		CartaDAO alterarCarta = new CartaDAO();
		
		carta1.setId(idCarta);
		carta1.setNomeCarta(nomeCarta);
		carta1.setMana(mana);
		carta1.setImagem(imagem);
		carta1.setIconIMG(iconIMG);
		carta1.setTipoDaCarta(tipoDaCarta);
		carta1.setAtaque(ataque);
		carta1.setDefesa(defesa);
		carta1.setCartaDescricao(cartaDescricao);
		carta1.setFalaFavorita(falaFavorita);

		alterarCarta.alterar(carta1);
		out.println("Alterado no objeto/Scriptlet");
	%>
</body>
</html>