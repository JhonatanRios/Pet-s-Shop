import java.util.ArrayList;

import processing.core.PApplet;
import processing.core.PConstants;
import processing.core.PImage;

public class Guia {

	PApplet app;

	private int x;
	private int y;
	private int numero;
	private int ani;
	private int estado;

	private ArrayList<Compa> compaRef = new ArrayList<Compa>();

	private boolean borde;

	private PImage[] guia = new PImage[15];

	public Guia(PApplet app, int ani, int estado, int x, int y) {

		this.app = app;
		this.ani = ani;
		this.estado = estado;
		this.x = x;
		this.y = y;

		guia[0] = app.loadImage("laDefense.jpg");
		guia[1] = app.loadImage("laDefense.jpg");
		guia[2] = app.loadImage("laDefense.jpg");
		guia[3] = app.loadImage("laDefense.jpg");
		guia[4] = app.loadImage("laDefense.jpg");
		guia[5] = app.loadImage("laDefense.jpg");
		guia[6] = app.loadImage("laDefense.jpg");
		guia[7] = app.loadImage("laDefense.jpg");
		guia[8] = app.loadImage("laDefense.jpg");
		guia[9] = app.loadImage("laDefense.jpg");
		guia[10] = app.loadImage("laDefense.jpg");
		guia[11] = app.loadImage("laDefense.jpg");
		guia[12] = app.loadImage("laDefense.jpg");
		guia[13] = app.loadImage("laDefense.jpg");
		guia[14] = app.loadImage("laDefense.jpg");
	}

	public void pintar() {
		pintarGuia(app);
		pintarCompa(app);
	}

	private void pintarGuia(PApplet app) {
		// Cerdo.
		if (ani == 0) {
			app.image(guia[0], x, y);
		}
		if (ani == 1) {
			app.image(guia[1], x, y);
		}
		if (ani == 2) {
			app.image(guia[2], x, y);
		}
		// Perro.
		if (ani == 3) {
			app.image(guia[3], x, y);
		}
		if (ani == 4) {
			app.image(guia[4], x, y);
		}
		if (ani == 5) {
			app.image(guia[5], x, y);
		}
		// Gato.
		if (ani == 6) {
			app.image(guia[6], x, y);
		}
		if (ani == 7) {
			app.image(guia[7], x, y);
		}
		if (ani == 8) {
			app.image(guia[8], x, y);
		}
		// Conejo.
		if (ani == 9) {
			app.image(guia[9], x, y);
		}
		if (ani == 10) {
			app.image(guia[10], x, y);
		}
		if (ani == 11) {
			app.image(guia[11], x, y);
		}
		// Pez.
		if (ani == 12) {
			app.image(guia[12], x, y);
		}
		if (ani == 13) {
			app.image(guia[13], x, y);
		}
		if (ani == 14) {
			app.image(guia[14], x, y);
		}
	}

	private void pintarCompa(PApplet app) {
		for (int i = 0; i < compaRef.size(); i++) {
			compaRef.get(i).pintar(app);
			compaRef.get(i).setX(x);
			compaRef.get(i).setY(y);
			compaRef.get(i).setTet((float) (compaRef.get(i).getTet() + 0.05));
			compaRef.get(i).rotar();
		}
	}

	public void mover(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public void agregar(Compa compa) {
		compaRef.add(compa);
		for (int i = compaRef.size() - 1; i >= 0; i--) {
			compaRef.get(i).setTet(2 * PConstants.PI / compaRef.size() * i);
		}
	}

	public boolean validar(int x, int y) {
		return borde;
	}

	public ArrayList<Compa> getCompaRef() {
		return compaRef;
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
}
