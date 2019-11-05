<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ page
	import="	java.io.*,
					javax.servlet.*,
					classes.Carta,
					banco.CartaDAO,
					java.sql.PreparedStatement,
					java.sql.Connection,
					javax.servlet.ServletException,
					banco.ConnectionFactory,
					java.sql.ResultSet,
					java.util.ArrayList,
					java.util.List"%>

<!DOCTYPE html>
<html>

<head>
<meta charset="ISO-8859-1">
<title>Selecione uma carta</title>
</head>

<body>
	<%
		Connection connection = new ConnectionFactory().getConnection();

		PreparedStatement stmt = connection.prepareStatement("select * from carta");
		ResultSet rs = stmt.executeQuery();

		List<Carta> cartas = new ArrayList<Carta>();

		Carta carta1 = new Carta();

		while (rs.next()) {

			// criando o objeto Contato
			carta1.setNomeCarta(rs.getString("nomeCarta"));
			carta1.setMana(rs.getInt("mana"));
			carta1.setImagem(rs.getString("imagem"));
			carta1.setIconIMG(rs.getString("iconIMG"));
			carta1.setTipoDaCarta(rs.getString("tipoDaCarta"));
			carta1.setAtaque(rs.getInt("ataque"));
			carta1.setDefesa(rs.getInt("defesa"));
			carta1.setCartaDescricao(rs.getString("cartaDescricao"));
			carta1.setFalaFavorita(rs.getString("falaFavorita"));
			
			// adicionando o objeto à lista
			cartas.add(carta1);
		}

		rs.close();
		stmt.close();
		
		for (int i = 0; i < cartas.size();i++){
			out.println("Nome da carta: "+cartas.get(i).getNomeCarta() + "\n");
			out.println("Mana: "+cartas.get(i).getMana() + "\n");
			out.println("Url da Imagem: "+cartas.get(i).getImagem() + "\n");
			out.println("Url do icone: "+cartas.get(i).getIconIMG() + "\n");
			out.println("Tipo da carta: "+cartas.get(i).getTipoDaCarta() + "\n");
			out.println("Ataque: "+cartas.get(i).getAtaque() + "\n");
			out.println("Defesa: "+cartas.get(i).getDefesa() + "\n");
			out.println("Descrição: "+cartas.get(i).getCartaDescricao() + "\n");
			out.println("Fala Favorita: "+cartas.get(i).getFalaFavorita() + "\n");
		}
		
		
		
	%>
	<!--<br>
	<label id="nomeCarta">id = ${param.id }</label>
	<br>
	<label id="mana">id = ${param.mana }.</label><br>
                <label id="imagem">id = ${param.imagem }.</label><br>
                <label id="iconIMG">id = ${param.iconIMG }.</label><br>
                <label id="tipoDaCarta">id = ${param.tipoDaCarta }.</label><br>
                <label id="ataque">id = ${param.ataque }.</label><br>
                <label id="defesa">id = ${param.defesa }.</label><br>
                <label id="cartaDescricao">id = ${param.cartaDescricao }.</label><br>
                <label id="falaFavorita">id = ${param.falaFavorita }.</label> !-->
</body>

</html>