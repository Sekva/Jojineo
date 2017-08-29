package epa.sekva.jojineo.states;

import java.awt.Graphics;

import epa.sekva.jojineo.Game;
import epa.sekva.jojineo.entidade.creaturas.Pleiador;
import epa.sekva.jojineo.locais.Local;

public class GameState extends State{
	
	private Pleiador jogador;
	
	private Local teste;
	
	public GameState(Game game) {
		super(game);
		jogador = new Pleiador(game, 40, 40);
		teste = new Local("res/locais/local1.lcl");
	}

	@Override
	public void tick() {
		// TODO Auto-generated method stub
		teste.tick();
		jogador.tick();
		
	}

	@Override
	public void render(Graphics g) {
		// TODO Auto-generated method stub
		teste.render(g);
		jogador.render(g);
		
	}

}
