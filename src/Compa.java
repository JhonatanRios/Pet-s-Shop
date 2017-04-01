import processing.core.PApplet;
import processing.core.PConstants;
import processing.core.PImage;

public class Compa implements Pintable, Comparable<Compa> {

	private int ani;
	private int conejo;
	private int gato;
	private int perro;
	private int pez;

	private float x;
	private float y;

	private int a;
	private int bDos;

	private float rad = 45;
	private float tet = 2 / PConstants.PI;

	private PImage[] recogible = new PImage[5];

	PApplet app;

	public Compa(PImage[] recogible, int ani, PApplet app) {
		this.app = app;
		this.ani = ani;
		this.recogible = recogible;
		this.x = (int) app.random(360, 950);
		this.y = (int) app.random(50, 550);
		a = 0;
		bDos = 0;
		conejo = 0;
		gato = 0;
		perro = 0;
		pez = 0;
	}

	public void pintar() {
		app.image(recogible[ani], x, y);
		// Cerdo.
		if (ani == 0) {
			conejo = 4;
			gato = 3;
			perro = 2;
			pez = 1;
		}
		// Conejo.
		if (ani == 1) {
			conejo = 0;
			gato = 4;
			perro = 3;
			pez = 2;
		}
		// Gato.
		if (ani == 2) {
			conejo = 1;
			gato = 0;
			perro = 4;
			pez = 3;
		}
		// Perro.
		if (ani == 3) {
			conejo = 2;
			gato = 1;
			perro = 0;
			pez = 4;
		}
		// Pez.
		if (ani == 4) {
			conejo = 3;
			gato = 2;
			perro = 1;
			pez = 0;
		}
	}

	public void pintarDos(int x, int y) {
		this.x = x;
		this.y = y;
		app.image(recogible[ani], x, y);
	}

	public void mover(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public void rotar() {
		a = (int) (rad * PApplet.cos(tet));
		bDos = (int) (rad * PApplet.sin(tet));
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

	public float getTet() {
		return tet;
	}

	public void setTet(float tet) {
		this.tet = tet;
	}

	public int getPrePosX() {
		return 0;
	}

	public int getPrePosY() {
		return 0;
	}

	public int getAni() {
		return ani;
	}

	public void setAni(int ani) {
		this.ani = ani;
	}

	public int compareTo(Compa o) {
		return o.ani - ani;
	}

	public int getConejo() {
		return conejo;
	}

	public void setConejo(int conejo) {
		this.conejo = conejo;
	}

	public int getGato() {
		return gato;
	}

	public void setGato(int gato) {
		this.gato = gato;
	}

	public int getPerro() {
		return perro;
	}

	public void setPerro(int perro) {
		this.perro = perro;
	}

	public int getPez() {
		return pez;
	}

	public void setPez(int pez) {
		this.pez = pez;
	}

	// public int compareD(Compa o) {
	// return o.conejo - conejo;
	// }
	//
	// public int compareT(Compa o) {
	// return o.gato - gato;
	// }
	//
	// public int compareC(Compa o) {
	// return o.perro - perro;
	// }
	//
	// public int compareCi(Compa o) {
	// return o.pez - pez;
	// }

}
