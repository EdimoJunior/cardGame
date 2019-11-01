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
            <title>Selecione uma carta</title>
        </head>

        <body>
            <%
		String nomeCarta = request.getParameter("NomeCarta"); //nome do input.
		int mana = Integer.parseInt(request.getParameter("Mana"));
		String imagem = request.getParameter("Imagem");
		String tipoDaCarta = request.getParameter("TipoDaCarta");
		int ataque = Integer.parseInt(request.getParameter("Ataque"));
		int defesa = Integer.parseInt(request.getParameter("Defesa"));
		String cartaDescricao = request.getParameter("cartaDescricao");
		
		Carta carta1 = new Carta();
		CartaDAO cadastroCarta = new CartaDAO();
		
		carta1.setNomeCarta(nomeCarta);
		carta1.setMana(mana);
		carta1.setImagem(imagem);
		carta1.setTipoDaCarta(tipoDaCarta);
		carta1.setAtaque(ataque);
		carta1.setDefesa(defesa);
		carta1.setCartaDescricao(cartaDescricao);
		
		cadastroCarta.adicionar(carta1);
		out.println("Selecionado no objeto/Scriptlet");
	%>
        </body>

        </html>