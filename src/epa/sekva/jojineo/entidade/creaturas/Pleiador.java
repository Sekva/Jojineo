package epa.sekva.jojineo.entidade.creaturas;

import java.awt.Graphics;

import epa.sekva.jojineo.Game;
import epa.sekva.jojineo.gfx.Assets;

public class Pleiador extends Creatura{
	
	private Game game;

	public Pleiador(Game game, float x, float y) {
		super(x, y, Creatura.widthPadrao, Creatura.heightPadrao);
		// TODO Auto-generated constructor stub
		this.game = game;
	}

	@Override
	public void tick() {
		// TODO Auto-generated method stub
		pegaInput();
		move();
		
	}
	
	private void pegaInput() {
		xMove = 0;
		yMove = 0;
		
		if(game.entregaControle().sobe) {
			yMove = -velocidade;
		}
		
		if(game.entregaControle().desce) {
			yMove = velocidade;
		}
		
		if(game.entregaControle().esrq) {
			xMove = -velocidade;
		}
		
		if(game.entregaControle().drt) {
			xMove = velocidade;
		}
	}

	@Override
	public void render(Graphics g) {
		// TODO Auto-generated method stub
		g.drawImage(Assets.player, (int)x, (int)y, width, height, null);
		
	}

}
