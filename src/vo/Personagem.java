package vo;

import java.util.Random;

class Personagem {

	private String nome;
	private String classe;
	private int resistencia;
	private int forca;
	private int inteligencia;
	private int vida;
	private int magia;

	public Personagem(String nome, String classe, int resistencia, int forca, int inteligencia) {
		this.nome = nome;
		this.classe = classe;
		this.resistencia = resistencia;
		this.forca = forca;
		this.inteligencia = inteligencia;
		this.vida = this.resistencia*10;
		this.magia = this.inteligencia*10;
		
	}
	public String getClasse() {
		return classe;
	}
	public void setClasse(String classe) {
		this.classe = classe;
	}
	public int getInteligencia() {
		return inteligencia;
	}
	public void setInteligencia(int inteligencia) {
		this.inteligencia = inteligencia;
	}
	public int getResistencia() {
		return resistencia;
	}
	public void setResistencia(int resistencia) {
		this.resistencia = resistencia;
	}
	public int getForca() {
		return forca;
	}
	public void setForca(int forca) {
		this.forca = forca;
	}
	public int getVida() {
		return vida;
	}
	public void setVida(int vida) {
		this.vida = vida;
	}
	public int getMagia() {
		return magia;
	}
	public void setMagia(int magia) {
		this.magia = magia;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int ataque() {
		int numeroAleatorio = (new Random()).nextInt(9)+1;
		return numeroAleatorio * forca;
	}
	public String moverParaFrente() {
		return this.nome+" anda para frente.";
	}
	public String receberDano(int dano) {
		this.vida -= dano;
		if(this.vida > 0) {
			return this.nome + " esta com " + this.vida + " pontos de vida";
		}
		return this.nome + " morreu";
	}
	public int bolaDeFogo() {
		int numeroAleatorio = (new Random()).nextInt(20) * inteligencia;
		this.magia -= 10;
		return numeroAleatorio;
	}
}
