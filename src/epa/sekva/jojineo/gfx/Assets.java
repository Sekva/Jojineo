package epa.sekva.jojineo.gfx;

import java.awt.image.BufferedImage;

public class Assets {
	
	private static final int scl = 32;
	
	public static BufferedImage player, terra, grama, pedra, arvore;
	
	public static void init() {
		SpriteSheet sheet = new SpriteSheet(CarregadorImagem.loadImage("/textures/sheet.png"));
		
		player = sheet.cortar(0, 0, scl, scl);
		terra = sheet.cortar(scl, 0, scl, scl);
		grama = sheet.cortar(scl * 2, 0, scl, scl);
		pedra = sheet.cortar(scl * 3, 0, scl, scl);
		arvore = sheet.cortar(0, scl, scl, scl);
		
	}

}
