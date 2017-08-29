package epa.sekva.jojineo.tile;

import epa.sekva.jojineo.gfx.Assets;

public class PedraTile extends Tile{

	public PedraTile(int id) {
		super(Assets.pedra, id);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public boolean objSolido() {
		return true;
	}

}
