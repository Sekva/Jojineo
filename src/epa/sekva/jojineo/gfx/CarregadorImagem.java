package epa.sekva.jojineo.gfx;

import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;

public class CarregadorImagem {
	
	public static BufferedImage loadImage(String caminho) {
		try {
			return ImageIO.read(CarregadorImagem.class.getResource(caminho));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.exit(1);
		}
		return null;
	}
}
