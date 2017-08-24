package epa.sekva.jojineo.entidade.creaturas;

import java.awt.Graphics;

import epa.sekva.jojineo.gfx.Assets;

public class Pleiador extends Creatura{

	public Pleiador(float x, float y) {
		super(x, y);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void tick() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void render(Graphics g) {
		// TODO Auto-generated method stub
		g.drawImage(Assets.player, (int)x, (int)y, null);
		
	}

}
