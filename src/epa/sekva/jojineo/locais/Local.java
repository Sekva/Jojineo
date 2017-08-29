package epa.sekva.jojineo.locais;

import java.awt.Graphics;

import epa.sekva.jojineo.tile.Tile;
import epa.sekva.jojineo.util.Util;

public class Local {

	private int width, height;
	private int spawnX, spawnY;
	private int[][] tiles;
	
	public Local(String path){
		loadWorld(path);
	}
	
	public void tick(){
		
	}
	
	public void render(Graphics g){
		for(int y = 0;y < height;y++){
			for(int x = 0;x < width;x++){
				getTile(x, y).render(g, x * Tile.scl, y * Tile.scl);
			}
		}
	}
	
	public Tile getTile(int x, int y){
		Tile t = Tile.tiles[tiles[x][y]];
		if(t == null)
			return Tile.gramaTile;
		return t;
	}
	
	private void loadWorld(String path){
		String file = Util.carregaArqParaString(path);
		String[] tokens = file.split("\\s+");
		width = Util.parseInt(tokens[0]);
		height = Util.parseInt(tokens[1]);
		spawnX = Util.parseInt(tokens[2]);
		spawnY = Util.parseInt(tokens[3]);
		
		tiles = new int[width][height];
		for(int y = 0;y < height;y++){
			for(int x = 0;x < width;x++){
				tiles[x][y] = Util.parseInt(tokens[(x + y * width) + 4]);
			}
		}
	}
	
}








