import java.util.ArrayList;
import processing.core.PApplet;
import processing.core.PConstants;
import processing.core.PImage;

public class Guia implements Pintable {

	PApplet app;

	private float x;
	private float y;
	private int ani;

	ArrayList<Compa> compaRef = new ArrayList<Compa>();

	private boolean borde;

	private PImage[] guia = new PImage[15];

	public Guia(PApplet app, int ani) {

		this.app = app;
		this.ani = ani;
		x = (int) app.random(310, 950);
		y = (int) app.random(50, 550);

		guia[0] = app.loadImage("../data/Cerdo.png");
		guia[1] = app.loadImage("../data/Conejo.png");
		guia[2] = app.loadImage("../data/Gato.png");
		guia[3] = app.loadImage("../data/Perro.png");
		guia[4] = app.loadImage("../data/Pez.png");
		guia[5] = app.loadImage("../data/Cerdo2.png");
		guia[6] = app.loadImage("../data/Conejo2.png");
		guia[7] = app.loadImage("../data/Gato2.png");
		guia[8] = app.loadImage("../data/Perro2.png");
		guia[9] = app.loadImage("../data/Pez2.png");
		guia[10] = app.loadImage("../data/Cerdo3.png");
		guia[11] = app.loadImage("../data/Conejo3.png");
		guia[12] = app.loadImage("../data/Gato3.png");
		guia[13] = app.loadImage("../data/Perro3.png");
		guia[14] = app.loadImage("../data/Pez3.png");
	}

	@Override
	public void pintar() {
		pintarGuia(app);
		// pintarCompa(app);
	}

	private void pintarGuia(PApplet app) {
		app.imageMode(PConstants.CENTER);
		// Triste
		// Cerdo
		if (ani == 0) {
			app.image(guia[ani], x, y);
		}
		// Conejo
		if (ani == 1) {
			app.image(guia[ani], x, y);
		}
		// Gato
		if (ani == 2) {
			app.image(guia[ani], x, y);
		}
		// Perro
		if (ani == 3) {
			app.image(guia[ani], x, y);
		}
		// Pez
		if (ani == 4) {
			app.image(guia[ani], x, y);
		}

		// Normal
		// Cerdo
		if (ani == 5) {
			app.image(guia[ani], x, y);
		}

		// Conejo
		if (ani == 6) {
			app.image(guia[ani], x, y);
		}

		// Gato
		if (ani == 7) {
			app.image(guia[ani], x, y);
		}

		// Perro
		if (ani == 8) {
			app.image(guia[ani], x, y);
		}

		// Pez
		if (ani == 9) {
			app.image(guia[ani], x, y);
		}

		// Feliz
		// Cerdo
		if (ani == 10) {
			app.image(guia[ani], x, y);
		}

		// Conejo
		if (ani == 11) {
			app.image(guia[ani], x, y);
		}

		// Gato
		if (ani == 12) {
			app.image(guia[ani], x, y);
		}

		// Perro
		if (ani == 13) {
			app.image(guia[ani], x, y);
		}

		// Pez
		if (ani == 14) {
			app.image(guia[ani], x, y);
		}
		app.imageMode(PConstants.CORNER);
	}

	private void pintarCompa(PApplet app) {
		for (int i = 0; i < compaRef.size(); i++) {
			compaRef.get(i).pintar();
			compaRef.get(i).setX(x);
			compaRef.get(i).setY(y);
			compaRef.get(i).setTet((float) (compaRef.get(i).getTet() + 0.05));
			compaRef.get(i).rotar();
		}
	}

	public boolean Agregar(Compa c) {
		if (compaRef.size() < 10) {
			compaRef.add(c);
			for (int i = compaRef.size() - 1; i >= 0; i--) {
				compaRef.get(i).setTet(2 * PConstants.PI / compaRef.size() * i);
			}
			return true;
		}
		return false;
	}

	public boolean validar(int wx, int wy) {
		if (PApplet.dist(wx, wy, this.x, this.y) < 2) {
			this.borde = true;
			return true;
		}
		this.borde = false;
		return false;
	}

	public ArrayList<Compa> getCompaRef() {
		return compaRef;
	}

	public float getX() {
		return x;
	}

	public void setX(float x) {
		this.x = x;
	}

	public float getY() {
		return y;
	}

	public void setY(float y) {
		this.y = y;
	}

}
