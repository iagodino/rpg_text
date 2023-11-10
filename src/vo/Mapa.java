package vo;

import java.util.ArrayList;

public class Mapa {
	
	private int altura = 80;
	private int largura = 80;
	private ArrayList linhas;
	private ArrayList colunas;
	
	public Mapa() {
		this.init();
	}

	private void init() {
		this.linhas = new ArrayList<Objeto>();
		this.colunas = new ArrayList<Objeto>();
	}

	public Mapa(int altura, int largura) {
		this.altura = altura;
		this.largura = largura;
		this.init();
	}

	public int getAltura() {
		return altura;
	}

	public void setAltura(int altura) {
		this.altura = altura;
	}

	public int getLargura() {
		return largura;
	}

	public void setLargura(int largura) {
		this.largura = largura;
	}

	public ArrayList getLinhas() {
		return linhas;
	}

	public void setLinhas(ArrayList linhas) {
		this.linhas = linhas;
	}

	public ArrayList getColunas() {
		return colunas;
	}

	public void setColunas(ArrayList colunas) {
		this.colunas = colunas;
	}
	
}
