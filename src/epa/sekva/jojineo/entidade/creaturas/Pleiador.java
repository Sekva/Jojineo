package epa.sekva.jojineo.entidade.creaturas;

import java.awt.Graphics;

import epa.sekva.jojineo.Game;
import epa.sekva.jojineo.gfx.Assets;

public class Pleiador extends Creatura{
	
	private Game game;

	public Pleiador(Game game, float x, float y) {
		super(x, y);
		// TODO Auto-generated constructor stub
		this.game = game;
	}

	@Override
	public void tick() {
		// TODO Auto-generated method stub
		if(game.entregaControle().sobe) {
			y -= 1;
		}
		
	}

	@Override
	public void render(Graphics g) {
		// TODO Auto-generated method stub
		g.drawImage(Assets.player, (int)x, (int)y, null);
		
	}

}
