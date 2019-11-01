package banco;

import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;

import classes.Carta;

public class CartaDAO {
	public Connection conexao;
	
	public CartaDAO() throws ServletException {
		this.conexao = new ConnectionFactory().getConnection();
		System.out.println("Conectado!");
	}
	
	public void adicionar(Carta carta) {
		String sql = "insert into carta (nomeCarta, mana, imagem, tipoDaCarta, ataque, defesa, cartaDescricao) values (?,?,?,?,?,?,?)";
		
		try {
			PreparedStatement ps = conexao.prepareStatement(sql);
			
			ps.setString(1, carta.getNomeCarta());
			ps.setInt(2, carta.getMana());
			ps.setString(3, carta.getImagem());
			ps.setString(4, carta.getTipoDaCarta());
			ps.setInt(5, carta.getAtaque());
			ps.setInt(6, carta.getDefesa());
			ps.setString(7, carta.getCartaDescricao());
			
			ps.execute();
			ps.close();
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("ERRO ao adicionar!");
		}
	}
	
	public void alterar(String nome) {
		String sql = "UPDATE carta SET nomeCarta = ?, mana = ?, imagem = ?, tipoDaCarta = ?, ataque = ?, defesa = ?, cartaDescricao = ? WHERE nomeCarta = "+nome;
		
		Carta carta = new Carta();
		
		try {
			PreparedStatement ps = conexao.prepareStatement(sql);
			
			ps.setString(1, carta.getNomeCarta());
			ps.setInt(2, carta.getMana());
			ps.setString(3, carta.getImagem());
			ps.setString(4, carta.getTipoDaCarta());
			ps.setInt(5, carta.getAtaque());
			ps.setInt(6, carta.getDefesa());
			ps.setString(7, carta.getCartaDescricao());
			
			ps.execute();
			ps.close();
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("ERRO ao tentar alterar!");
		}
	}
	
	public void selecionar() {
		
	}
	
	public void deletar() {
		
	}
}
