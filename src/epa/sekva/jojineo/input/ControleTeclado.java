package epa.sekva.jojineo.input;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class ControleTeclado implements KeyListener{
	
	private boolean[] keys;
	public boolean sobe, desce, esrq, drt;
	
	public ControleTeclado() {
		keys = new boolean[256];
	}
	
	
	public void tick() {
		sobe = keys[KeyEvent.VK_W];
		desce = keys[KeyEvent.VK_S];
		esrq = keys[KeyEvent.VK_A];
		drt = keys[KeyEvent.VK_D];
	}

	@Override
	public void keyPressed(KeyEvent arg0) {
		// TODO Auto-generated method stub
		keys[arg0.getKeyCode()] = true;
		
	}

	@Override
	public void keyReleased(KeyEvent arg0) {
		// TODO Auto-generated method stub
		keys[arg0.getKeyCode()] = false;
		
	}

	@Override
	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}

}
