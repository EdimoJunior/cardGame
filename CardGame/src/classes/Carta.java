package classes;

public class Carta {
	String nomeCarta, imagem, tipoDaCarta, cartaDescricao, iconIMG, falaFavorita;
	int mana, ataque, defesa, id;
	
	
	
	public Carta(String nomeCarta, String imagem, String tipoDaCarta, String cartaDescricao, String iconIMG,
			String falaFavorita, int mana, int ataque, int defesa, int id) {
		super();
		this.nomeCarta = nomeCarta;
		this.imagem = imagem;
		this.tipoDaCarta = tipoDaCarta;
		this.cartaDescricao = cartaDescricao;
		this.iconIMG = iconIMG;
		this.falaFavorita = falaFavorita;
		this.mana = mana;
		this.ataque = ataque;
		this.defesa = defesa;
		this.id = id;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNomeCarta() {
		return nomeCarta;
	}
	public void setNomeCarta(String nomeCarta) {
		this.nomeCarta = nomeCarta;
	}
	
	public String getImagem() {
		return imagem;
	}
	public void setImagem(String imagem) {
		this.imagem = imagem;
	}
	
	public String getIconIMG() {
		return iconIMG;
	}
	public void setIconIMG(String iconIMG) {
		this.iconIMG = iconIMG;
	}
	
	public String getTipoDaCarta() {
		return tipoDaCarta;
	}
	public void setTipoDaCarta(String tipoDaCarta) {
		this.tipoDaCarta = tipoDaCarta;
	}
	
	public String getCartaDescricao() {
		return cartaDescricao;
	}
	public void setCartaDescricao(String cartaDescricao) {
		this.cartaDescricao = cartaDescricao;
	}
	
	public int getMana() {
		return mana;
	}
	public void setMana(int mana) {
		this.mana = mana;
	}
	
	public int getAtaque() {
		return ataque;
	}
	public void setAtaque(int ataque) {
		this.ataque = ataque;
	}
	
	public int getDefesa() {
		return defesa;
	}
	public void setDefesa(int defesa) {
		this.defesa = defesa;
	}
	
	public String getFalaFavorita() {
		return falaFavorita;
	}
	public void setFalaFavorita(String falaFavorita) {
		this.falaFavorita = falaFavorita;
	}
	
	public Carta(String nomeCarta, String imagem, String tipoDaCarta, String cartaDescricao, String iconIMG,
			String falaFavorita, int mana, int ataque, int defesa) {
		super();
		this.nomeCarta = nomeCarta;
		this.imagem = imagem;
		this.tipoDaCarta = tipoDaCarta;
		this.cartaDescricao = cartaDescricao;
		this.iconIMG = iconIMG;
		this.falaFavorita = falaFavorita;
		this.mana = mana;
		this.ataque = ataque;
		this.defesa = defesa;
	}
	
	public Carta() {
		super();
	}
}
