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
import br.servlet.SelecionarCarta;

public class AlterarCarta {
	
	SelecionarCarta selecao = new SelecionarCarta();
	
	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		PrintWriter pw = res.getWriter();
		
		int idCarta = Integer.parseInt(req.getParameter("id"));
		System.out.println("id = " + idCarta);
		
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
				"<body>");	
		
		Connection connection = new ConnectionFactory().getConnection();

		PreparedStatement stmt;
	}
}
