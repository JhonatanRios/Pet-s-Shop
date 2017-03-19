import processing.core.PApplet;

public class CompaPez extends Compa {

	public CompaPez(PApplet app) {
		super(app);
		codigo = 2;
		a = 0;
		bDos = 0;
	}

	@Override
	public void pintarDos() {
		app.fill(255, 153, 9);
		app.ellipse(x + a, y + bDos, 20, 20);
	}

}
