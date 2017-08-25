package epa.sekva.jojineo.entidade.creaturas;

import epa.sekva.jojineo.entidade.Entidade;

public abstract class Creatura extends Entidade{
	
	protected int vida;
	protected float velocidade;
	
	public static final int vidaPadrao = 10;
	public static final float velocidadePadrao = 2.0f;
	
	public static final int widthPadrao = 64;
	public static final int heightPadrao = 64;
	
	protected float xMove, yMove;

	public Creatura(float x, float y, int width, int height) {
		super(x, y, width, height);
		 vida = vidaPadrao;
		 velocidade = velocidadePadrao;
		 xMove = 0;
		 yMove = 0;
		// TODO Auto-generated constructor stub
	}
	
	
	public void move() {
		x += xMove;
		y += yMove;
	}
	
	
	//GET SET

	public static int getVidapadrao() {
		return vidaPadrao;
	}

	public static float getVelocidadepadrao() {
		return velocidadePadrao;
	}

	public float getxMove() {
		return xMove;
	}

	public void setxMove(float xMove) {
		this.xMove = xMove;
	}

	public float getyMove() {
		return yMove;
	}

	public void setyMove(float yMove) {
		this.yMove = yMove;
	}

	public int getVida() {
		return vida;
	}

	public void setVida(int vida) {
		this.vida = vida;
	}

	public float getVelocidade() {
		return velocidade;
	}

	public void setVelocidade(float velocidade) {
		this.velocidade = velocidade;
	}
	
	

}
