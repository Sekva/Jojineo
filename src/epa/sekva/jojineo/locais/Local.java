package epa.sekva.jojineo.locais;

import java.awt.Graphics;

import epa.sekva.jojineo.tile.Tile;

public class Local {
	private int width, height;
	private int[][] mapa;
	
	public Local(String caminho) {
		carregaLocal(caminho);
	}
	
	public void tick() {
	}
	
	public void render(Graphics g) {
		for(int y = 0; y < height; y++) {
			for(int x = 0; x < width; x++) {
				entregraTile(x, y).render(g, x * Tile.scl, y * Tile.scl);
				
			}
		}
		
	}
	
	public Tile entregraTile(int x, int y) {
		Tile t = Tile.tiles[mapa[x][y]];
		if(t == null) {
			return Tile.terraTile;
		}
		
		return t;
	}
	
	private void carregaLocal(String caminho) {
		
	}
	
	
}
