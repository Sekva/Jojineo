package epa.sekva.jojineo;

import java.awt.Graphics;
import java.awt.image.BufferStrategy;
//import java.awt.image.BufferedImage;

import epa.sekva.jojineo.display.Display;
import epa.sekva.jojineo.gfx.Assets;
import epa.sekva.jojineo.input.ControleTeclado;
import epa.sekva.jojineo.states.GameState;
//import epa.sekva.jojineo.states.MenuState;
//import epa.sekva.jojineo.states.OpcoesState;
import epa.sekva.jojineo.states.State;
//import epa.sekva.jojineo.gfx.CarregadorImagem;
//import epa.sekva.jojineo.gfx.SpriteSheet;

public class Game implements Runnable {
		
	private Display display;
	
	public int width, height;
	public String title;
	private boolean rodando = false;
	
	private Thread thread;
	
	private BufferStrategy bs;
	private Graphics g;
	
	//ESTADOS
	
	private State gameState;
	//private State menuState;
	//private State opcoesState;
	
	//Input
	private ControleTeclado controle; 
	
	
	public Game(String title, int width, int height) {
		
		this.width = width;
		this.height = height;
		this.title = title;
		controle  = new ControleTeclado();
		
		
	}
	
	private void init() {	

		display = new Display(title, width, height);
		display.entregaFrame().addKeyListener(controle);
		Assets.init();
		
		gameState = new GameState(this);
		//menuState = new MenuState(this);
		//opcoesState = new OpcoesState(this);
		State.setState(gameState);
		
	}
	
	
	private void update() {
		controle.tick();
		if(State.entregaState() != null) {
			State.entregaState().tick();
		}
	}
	
	private void render() {
		bs = display.entregaCanvas().getBufferStrategy();
		if(bs == null) {
			display.entregaCanvas().createBufferStrategy(3);
			return;
		}
		
		g = bs.getDrawGraphics();
		//LIMPADA
		g.clearRect(0, 0, width, height);
		//RISCA
		
		if(State.entregaState() != null) {
			State.entregaState().render(g);
		}
		
		//PARA PORRA
		bs.show();
		g.dispose();
		
	}
	
	public void run() {
		
		init();
		
		int fps = 57;
		double tempoPUpdate = 1000000000 / fps;
		double delta = 0;
		long agr;
		long ultimoT = System.nanoTime();
		long timer = 0;
		int tocs = 0;
				
		while(rodando) {
			
			agr = System.nanoTime();
			delta += (agr - ultimoT) / tempoPUpdate;
			timer += agr - ultimoT;
			
			ultimoT = agr;
			
			if (delta >= 1) {
				update();
				render();
				tocs++;
				delta--;
				
			}
			
			if (timer >= 1000000000) {
				System.out.println(tocs);
				timer = 0;
				tocs = 0;
			}
			
		}
		
		stop();
			
	}
	
	public ControleTeclado entregaControle() {
		return controle;
	}
	
	public synchronized void start() {
		if(rodando) {
			return;
		}
		rodando = true;
		
		thread = new Thread(this);
		thread.start();
		
	}
		
	public synchronized void stop() {
		
		if(rodando) {
			try {
				thread.join();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}else {return;}
	}
	
	
}
