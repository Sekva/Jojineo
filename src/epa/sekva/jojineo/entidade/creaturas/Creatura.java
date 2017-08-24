package epa.sekva.jojineo.entidade.creaturas;

import epa.sekva.jojineo.entidade.Entidade;

public abstract class Creatura extends Entidade{
	
	protected int vida;

	public Creatura(float x, float y) {
		super(x, y);
		 vida = 10;
		// TODO Auto-generated constructor stub
	}
	
	

}
