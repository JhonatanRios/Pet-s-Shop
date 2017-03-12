import processing.core.PApplet;
import processing.event.MouseEvent;

public class Main extends PApplet {

	private Logica log;

	public static void main(String[] args) {
		PApplet.main("Main");
	}

	public void settings() {
		size(800, 800);
	}

	public void setup() {
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

	public void mouseReleased() {
		log.soltar();
	}

	public void mouseClicked(MouseEvent event) {
		if (event.getClickCount() == 2) {// usar el doble click
			log.creaGuia(this, mouseX, mouseY);
			log.creaCompa(this, mouseX, mouseY);
		}
	}

}
