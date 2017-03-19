import processing.core.PApplet;

public class CompaConejo extends Compa {

	public CompaConejo(PApplet app) {
		super(app);
		codigo = 4;
		a = 0;
		bDos = 0;
	}

	@Override
	public void pintarDos() {
		app.fill(255, 255, 255);
		app.ellipse(x + a, y + bDos, 20, 20);
	}

}
