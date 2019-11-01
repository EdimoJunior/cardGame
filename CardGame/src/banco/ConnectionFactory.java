package banco;

import java.sql.Connection;
import java.sql.DriverManager;

import javax.servlet.ServletException;

public class ConnectionFactory {
	public Connection getConnection() throws ServletException{
		try {
			DriverManager.registerDriver(new com.mysql.jdbc.Driver());
			return DriverManager.getConnection("jdbc:mysql://localhost/carta_bd", "root", "");
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Não conectou");
			throw new ServletException();
		}
	}
}
