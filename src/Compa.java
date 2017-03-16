import processing.core.PApplet;
import processing.core.PConstants;

public class Compa {

	private int x;
	private int y;

	private int a;
	private int bDos;
	private int ani;

	private float rad = 45;
	private float tet = 2 / PConstants.PI;

	public Compa(int ani, int x, int y) {
		this.ani = ani;
		this.x = x;
		this.y = y;
		a = 0;
		bDos = 0;
	}

	public void pintar(PApplet app) {
		// Cerdo.
		if (ani == 0) {
			app.fill(232, 144, 125);
			app.ellipse(x + a, y + bDos, 20, 20);
		}
		// Conejo.
		if (ani == 3) {
			app.fill(255, 255, 255);
			app.ellipse(x + a, y + bDos, 20, 20);
		}
		// Gato.
		if (ani == 2) {
			app.fill(193, 176, 160);
			app.ellipse(x + a, y + bDos, 20, 20);
		}
		// Perro.
		if (ani == 1) {
			app.fill(193, 155, 100);
			app.ellipse(x + a, y + bDos, 20, 20);
		}
		// Pez.
		if (ani == 4) {
			app.fill(255, 153, 9);
			app.ellipse(x + a, y + bDos, 20, 20);
		}
	}

	public void mover(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public void rotar() {
		a = (int) (rad * PApplet.cos(tet));
		bDos = (int) (rad * PApplet.sin(tet));
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public float getTet() {
		return tet;
	}

	public void setTet(float tet) {
		this.tet = tet;
	}
}
