import processing.core.PApplet;

public class CompaGato extends Compa {

	public CompaGato(PApplet app) {
		super(app);
		codigo = 3;
		a = 0;
		bDos = 0;
	}

	@Override
	public void pintarDos() {
		app.fill(193, 176, 160);
		app.ellipse(x + a, y + bDos, 20, 20);
	}

}
