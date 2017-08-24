package epa.sekva.jojineo.states;

import java.awt.Graphics;

import epa.sekva.jojineo.Game;
import epa.sekva.jojineo.entidade.creaturas.Pleiador;

public class GameState extends State{
	
	private Pleiador jogador;
	
	public GameState(Game game) {
		super(game);
		jogador = new Pleiador(40, 40);
	}

	@Override
	public void tick() {
		// TODO Auto-generated method stub
		jogador.tick();
		
	}

	@Override
	public void render(Graphics g) {
		// TODO Auto-generated method stub
		
		jogador.render(g);
	}

}
