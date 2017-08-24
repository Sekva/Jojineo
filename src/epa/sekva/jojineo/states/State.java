package epa.sekva.jojineo.states;

import java.awt.Graphics;

import epa.sekva.jojineo.Game;

public abstract class State {
	
	private static State stateAtual = null;
	
	public static void setState(State state) {
		stateAtual = state;
	}
	
	public static State entregaState() {
		return stateAtual;
	}
	
	protected Game game;
	
	public State( Game game ) {
		this.game = game;
	}
	
	public abstract void tick();
	
	public abstract void render(Graphics g);
	

}
