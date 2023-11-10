package service;

import java.util.ArrayList;

import vo.Mapa;

public class MapaService {
	
	public MapaService() {
	}

	public Mapa getMapa() {
		return new Mapa();
	}
	
	public void mostraMapa(Mapa mapa) {
		ArrayList linhas = mapa.getLinhas();
		ArrayList colunas = mapa.getColunas();
	
		for (int row = 0; row < linhas.size(); row++) {
            for (int col = 0; col < linhas.get(0).size(); col++) {
                System.out.print(linhas.get(row).get(col) + ",");
            }
            System.out.println("");
		}
	}
}
