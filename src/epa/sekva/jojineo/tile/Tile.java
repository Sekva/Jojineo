package epa.sekva.jojineo.tile;

import java.awt.Graphics;
import java.awt.image.BufferedImage;

public class Tile {
	
	
	//CONFS
	
	public static Tile[] tiles = new Tile[256];
	public static Tile gramaTile = new GramaTile(0);
	public static Tile pedraTile = new PedraTile(1);
	public static Tile terraTile = new TerraTile(2);
	
	//CLASSE
	protected BufferedImage textura;
	protected final int id;
	
	public static final int scl = 64;
	
	public Tile(BufferedImage textura, int id) {
		this.textura = textura;
		this.id = id;
		
		tiles[id] = this;
	}
	
	public int entregaId() {
		return id;
	}
	
	public void tick() {
		
	}
	
	public boolean objSolido() {
		return false;
	}
	
	public void render(Graphics g, int x, int y) {
		g.drawImage(textura, x, y, scl, scl, null);
	}
}
