package epa.sekva.jojineo.entidade;

import java.awt.Graphics;

public abstract class Entidade {
	
	protected float x, y;
	protected int width, height;
	
	public Entidade(float x, float y, int width, int height) {
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
	}
	
	public abstract void tick();
	
	public abstract void render(Graphics g);
}
