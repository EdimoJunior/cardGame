package br.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import banco.ConnectionFactory;
import classes.Carta;

/**
 * Servlet implementation class SelecionarCarta
 */
@WebServlet("/SelecionarCarta")
public class SelecionarCarta extends HttpServlet {

	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		PrintWriter pw = res.getWriter();

		pw.println("<html>\r\n" + 
				"<head>\r\n" + 
				"<link rel=\"stylesheet\" href=\"https://use.fontawesome.com/releases/v5.8.1/css/all.css\" integrity=\"sha384-50oBUHEmvpQ+1lW4y57PTFmhCaXp0ML5d60M1M7uH2+nqUivzIebhndOJK28anvf\" crossorigin=\"anonymous\">\r\n" + 
				"<link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css\" integrity=\"sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T\" crossorigin=\"anonymous\">\r\n" + 
				"    <!-- Optional JavaScript -->\r\n" + 
				"    <!-- jQuery first, then Popper.js, then Bootstrap JS -->\r\n" + 
				"    <script src=\"https://code.jquery.com/jquery-3.3.1.slim.min.js\" integrity=\"sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo\" crossorigin=\"anonymous\">\r\n" + 
				"    </script>\r\n" + 
				"    <script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js\" integrity=\"sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1\" crossorigin=\"anonymous\">\r\n" + 
				"    </script>\r\n" + 
				"    <script src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js\" integrity=\"sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM\" crossorigin=\"anonymous\">\r\n" + 
				"    </script>\r\n" + 
				" <style>\r\n" + 
				"  table{\r\n" + 
				"      	border-collapse: collapse;\r\n" + 
				"      	margin:auto;\r\n" +
				"  }\r\n" +
				"  tr, td, th{\r\n" + 
				"      border: 1px solid black;\r\n" + 
				"      text-align: center;\r\n" + 
				"      \r\n" + 
				"  }\r\n" + 
				"  body{\r\n" + 
				"    text-align: center;\r\n" + 
				"  }\r\n" + 
				" </style>\r\n" + 
				"<nav class=\"navbar navbar-expand-lg navbar-dark navbar-ful bg-dark\">\r\n" + 
				"        <a class=\"navbar-brand\" href=\"#\">Sonic Card Game</a>\r\n" + 
				"        <button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\" data-target=\"#navbarColor01\" aria-controls=\"navbarColor01\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\r\n" + 
				"            <span class=\"navbar-toggler-icon\"></span>\r\n" + 
				"        </button>\r\n" + 
				"\r\n" + 
				"        <div class=\"collapse navbar-collapse\" id=\"navbarColor01\">\r\n" + 
				"            <ul class=\"navbar-nav mr-auto\">\r\n" + 
				"                <li class=\"nav-item\">\r\n" + 
				"                    <a class=\"nav-link\" href=\"index.html\">Criar carta<span class=\"sr-only\">(current)</span></a>\r\n" + 
				"                    <li class=\"nav-item\">\r\n" + 
				"                        <a class=\"nav-link\" href=\"SelecionarCarta\">Selecionar cartas</a>\r\n" + 
				"                    </li>\r\n" + 
				"            </ul>\r\n" + 
				"        </div>\r\n" + 
				"    </nav>"+
				"</head>\r\n" + 
				"<body>"+
				"<table class='table'>"+
				"<tr>"+
				"<th scope='col'>Nome</th>"+
				"<th scope='col'>Mana</th>"+
				"<th scope='col'>Url IMG</th>"+
				"<th scope='col'>Url Icon</th>"+
				"<th scope='col'>Tipo</th>"+
				"<th scope='col'>Ataque</th>"+
				"<th scope='col'>Defesa</th>"+
				"<th scope='col'>Descricao</th>"+
				"<th scope='col'>Fala</th>"+
				"<th scope='col'>Alterar</th>"+
				"<th scope='col'>Deletar</th>"+
				"<th scope='col'>Ver</th>");		
		
		Connection connection = new ConnectionFactory().getConnection();

		PreparedStatement stmt;
		try {
			stmt = connection.prepareStatement("select * from carta");
			ResultSet rs = stmt.executeQuery();

			List<Carta> cartas = new ArrayList<Carta>();

			

			while (rs.next()) {
				Carta carta1 = new Carta();
				// criando o objeto Contato
				carta1.setId(rs.getInt("id"));
				carta1.setNomeCarta(rs.getString("nomeCarta"));
				carta1.setMana(rs.getInt("mana"));
				carta1.setImagem(rs.getString("imagem"));
				carta1.setIconIMG(rs.getString("iconIMG"));
				carta1.setTipoDaCarta(rs.getString("tipoDaCarta"));
				carta1.setAtaque(rs.getInt("ataque"));
				carta1.setDefesa(rs.getInt("defesa"));
				carta1.setCartaDescricao(rs.getString("cartaDescricao"));
				carta1.setFalaFavorita(rs.getString("falaFavorita"));
				
				// adicionando o objeto � lista
				cartas.add(carta1);
			}

			rs.close();
			stmt.close();
			
			for (int i = 0; i < cartas.size();i++){
				System.out.println("ID: "+cartas.get(i).getId() + "\n");
				System.out.println("Nome da carta: "+cartas.get(i).getNomeCarta() + "\n");
				System.out.println("Mana: "+cartas.get(i).getMana() + "\n");
				System.out.println("Url da Imagem: "+cartas.get(i).getImagem() + "\n");
				System.out.println("Url do icone: "+cartas.get(i).getIconIMG() + "\n");
				System.out.println("Tipo da carta: "+cartas.get(i).getTipoDaCarta() + "\n");
				System.out.println("Ataque: "+cartas.get(i).getAtaque() + "\n");
				System.out.println("Defesa: "+cartas.get(i).getDefesa() + "\n");
				System.out.println("Descri��o: "+cartas.get(i).getCartaDescricao() + "\n");
				System.out.println("Fala Favorita: "+cartas.get(i).getFalaFavorita() + "\n");
			}
			
			for(int i = 0; i <= cartas.size()-1 ;i++){
				pw.println("<tr>");
				pw.println("<td>"+cartas.get(i).getNomeCarta()+"</td>");
				pw.println("<td>"+cartas.get(i).getMana()+"</td>"); 
				pw.println("<td>"+cartas.get(i).getImagem()+"</td>"); 
				pw.println("<td>"+cartas.get(i).getIconIMG()+"</td>"); 
				pw.println("<td>"+cartas.get(i).getTipoDaCarta()+"</td>"); 
				pw.println("<td>"+cartas.get(i).getAtaque()+"</td>"); 
				pw.println("<td>"+cartas.get(i).getDefesa()+"</td>"); 
				pw.println("<td>"+cartas.get(i).getCartaDescricao()+"</td>");
				pw.println("<td>"+cartas.get(i).getFalaFavorita()+"</td>"); 
				pw.println("<td><a href = 'AlterarCartaJSP.jsp?id="+cartas.get(i).getId()+"&nomeCarta="+cartas.get(i).getNomeCarta()+"&mana="+cartas.get(i).getMana()+
						"&imagem="+cartas.get(i).getImagem()+"&iconIMG="+cartas.get(i).getIconIMG()+"&tipoDaCarta="+cartas.get(i).getTipoDaCarta()+
						"&ataque="+cartas.get(i).getAtaque()+"&defesa="+cartas.get(i).getDefesa()+"&cartaDescricao="+cartas.get(i).getCartaDescricao()+
						"&falaFavorita="+cartas.get(i).getFalaFavorita()+
						"'<i class='far fa-edit'></i></a></td>");
				pw.println("<td><a href = 'ExcluirCartaJSP.jsp?id="+cartas.get(i).getId()+"'<i class='far fa-trash-alt'></i></td>");
				pw.println("<td><a href = 'card.html'<i class=\"fas fa-eye\"></i></td>");
				pw.println("</tr>");
	        }
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		/*pw.println("<!doctype html>\r\n" + 
				"<html lang=\"en\">\r\n" + 
				"\r\n" + 
				"<head>\r\n" + 
				"    <!-- Required meta tags -->\r\n" + 
				"    <meta charset=\"utf-8\">\r\n" + 
				"    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\r\n" + 
				"\r\n" + 
				"    <!-- font awesome-->\r\n" + 
				"    <link rel=\"stylesheet\" href=\"https://use.fontawesome.com/releases/v5.8.1/css/all.css\" integrity=\"sha384-50oBUHEmvpQ+1lW4y57PTFmhCaXp0ML5d60M1M7uH2+nqUivzIebhndOJK28anvf\" crossorigin=\"anonymous\">\r\n" + 
				"    <!-- Bootstrap CSS -->\r\n" + 
				"    <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css\" integrity=\"sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T\" crossorigin=\"anonymous\">\r\n" + 
				"    <!-- Optional JavaScript -->\r\n" + 
				"    <!-- jQuery first, then Popper.js, then Bootstrap JS -->\r\n" + 
				"    <script src=\"https://code.jquery.com/jquery-3.3.1.slim.min.js\" integrity=\"sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo\" crossorigin=\"anonymous\">\r\n" + 
				"    </script>\r\n" + 
				"    <script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js\" integrity=\"sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1\" crossorigin=\"anonymous\">\r\n" + 
				"    </script>\r\n" + 
				"    <script src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js\" integrity=\"sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM\" crossorigin=\"anonymous\">\r\n" + 
				"    </script>\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"    <title>Selecao de Cartas</title>\r\n" + 
				"\r\n" + 
				"    <nav class=\"navbar navbar-expand-lg navbar-dark navbar-ful bg-dark\">\r\n" + 
				"        <a class=\"navbar-brand\" href=\"#\">Sonic Card Game</a>\r\n" + 
				"        <button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\" data-target=\"#navbarColor01\" aria-controls=\"navbarColor01\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\r\n" + 
				"            <span class=\"navbar-toggler-icon\"></span>\r\n" + 
				"        </button>\r\n" + 
				"\r\n" + 
				"        <div class=\"collapse navbar-collapse\" id=\"navbarColor01\">\r\n" + 
				"            <ul class=\"navbar-nav mr-auto\">\r\n" + 
				"                <li class=\"nav-item\">\r\n" + 
				"                    <a class=\"nav-link\" href=\"index.html\">Criar carta<span class=\"sr-only\">(current)</span></a>\r\n" + 
				"                    <li class=\"nav-item\">\r\n" + 
				"                        <a class=\"nav-link\" href=\"SelecionarCarta\">Selecionar cartas</a>\r\n" + 
				"                    </li>\r\n" + 
				"                    <li class=\"nav-item\">\r\n" + 
				"                        <a class=\"nav-link\" href=\"card.html\">Ver Carta</a>\r\n" + 
				"                    </li>\r\n" + 
				"            </ul>\r\n" + 
				"        </div>\r\n" + 
				"    </nav>\r\n" + 
				"</head>\r\n" + 
				"\r\n" + 
				"<body>\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"    <div class=\"card bg-light\">\r\n" + 
				"        <article class=\"card-body mx-auto\" style=\"max-width: 400px;\">\r\n" + 
				"            <h4 class=\"card-title mt-3 text-center\">Selecione uma carta:</h4>\r\n" + 
				"\r\n" + 
				"        </article>\r\n" + 
				"    </div>\r\n" + 
				"    <!-- card.// -->\r\n" + 
				"</body>");*/

	}
}
