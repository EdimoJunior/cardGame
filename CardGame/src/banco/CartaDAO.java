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
		String sql = "insert into carta (nomeCarta, mana, imagem, iconIMG, tipoDaCarta, ataque, defesa, cartaDescricao, falaFavorita) values (?,?,?,?,?,?,?,?,?)";
		
		try {
			PreparedStatement ps = conexao.prepareStatement(sql);
			
			ps.setString(1, carta.getNomeCarta());
			ps.setInt(2, carta.getMana());
			ps.setString(3, carta.getImagem());
			ps.setString(4, carta.getIconIMG());
			ps.setString(5, carta.getTipoDaCarta());
			ps.setInt(6, carta.getAtaque());
			ps.setInt(7, carta.getDefesa());
			ps.setString(8, carta.getCartaDescricao());
			ps.setString(9, carta.getFalaFavorita());
			
			ps.execute();
			ps.close();
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("ERRO ao adicionar!");
		}
	}
	
	public void alterar(String nome) {
		String sql = "UPDATE carta SET nomeCarta = ?, mana = ?, imagem = ?, iconIMG = ?,tipoDaCarta = ?, ataque = ?, defesa = ?, cartaDescricao = ?, falaFavorita = ? WHERE nomeCarta = "+nome;
		
		Carta carta = new Carta();
		
		try {
			PreparedStatement ps = conexao.prepareStatement(sql);
			
			ps.setString(1, carta.getNomeCarta());
			ps.setInt(2, carta.getMana());
			ps.setString(3, carta.getImagem());
			ps.setString(4, carta.getIconIMG());
			ps.setString(5, carta.getTipoDaCarta());
			ps.setInt(6, carta.getAtaque());
			ps.setInt(7, carta.getDefesa());
			ps.setString(8, carta.getCartaDescricao());
			ps.setString(9, carta.getFalaFavorita());
			
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
