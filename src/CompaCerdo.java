import processing.core.PApplet;

public class CompaCerdo extends Compa {

	public CompaCerdo(PApplet app) {
		super(app);
		codigo = 5;
		a = 0;
		bDos = 0;
	}

	@Override
	public void pintarDos() {
		// TODO Auto-generated method stub
		app.fill(232, 144, 125);
		app.ellipse(x + a, y + bDos, 20, 20);
	}

}
