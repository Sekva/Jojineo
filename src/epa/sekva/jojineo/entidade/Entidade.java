package epa.sekva.jojineo.entidade;

import java.awt.Graphics;

public abstract class Entidade {
	
	protected float x, y;
	
	public Entidade(float x, float y) {
		this.x = x;
		this.y = y;
	}
	
	public abstract void tick();
	
	public abstract void render(Graphics g);
}
