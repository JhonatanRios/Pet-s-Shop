import processing.core.PApplet;

public class Main extends PApplet {

	static public PApplet app;
	private Logica log;

	public static void main(String[] args) {
		PApplet.main("Main");
	}

	public void settings() {
		size(1000, 600);
	}

	public void setup() {
		Main.app = this;
		log = new Logica(this);
	}

	public void draw() {
		background(255, 255, 255);
		log.pintar(this);
	}

	public void mousePressed() {
		log.pres(mouseX, mouseY);
	}

	public void mouseDragged() {
		log.mover(mouseX, mouseY);
	}

	public void mouseClicked() {
		log.pantalla();
		System.out.println(mouseX + " " + mouseY);
	}

	public void keyPressed() {
		log.tecla();
	}
}
