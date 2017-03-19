import processing.core.PApplet;

public class CompaPerro extends Compa {

	public CompaPerro(PApplet app) {
		super(app);
		codigo = 1;
		a = 0;
		bDos = 0;
	}

	@Override
	public void pintarDos() {
		app.fill(193, 155, 100);
		app.ellipse(x + a, y + bDos, 20, 20);
	}

}
