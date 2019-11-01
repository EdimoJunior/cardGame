package br.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class OiMundo extends HttpServlet {
	
	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		PrintWriter pw = res.getWriter();
		
		pw.println("<html>");
		pw.println("<head>");
		pw.println("<title>Projetinho do Edimo</title>");
		pw.println("<body>");
		pw.println("<h1>Olá Mundo, Olá Turma!</h1>");
		pw.println("</body>");
		pw.println("</html>");
	}
}
