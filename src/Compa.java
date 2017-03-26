import processing.core.PApplet;
import processing.core.PConstants;
import processing.core.PImage;

public abstract class Compa implements Pintable, Comparable<Compa> {

	private int ani;
//	private int conejo;
//	private int gato;
//	private int perro;
//	private int pez;

	private int x;
	private int y;

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
		this.x = (int) app.random(310, 1000);
		a = 0;
		bDos = 0;
	}

	public void pintar() {

		app.image(recogible[ani], x, y);

		// // Cerdo.
		// if (ani == 0) {
		// conejo=1;
		// gato=2;
		// perro=3;
		// pez=4;
		// }
		// // Conejo.
		// if (ani == 1) {
		// conejo;
		// gato;
		// perro;
		// pez;
		// }
		// // Gato.
		// if (ani == 2) {
		// conejo;
		// gato;
		// perro;
		// pez;
		// }
		// // Perro.
		// if (ani == 3) {
		// conejo;
		// gato;
		// perro;
		// pez;
		// }
		// // Pez.
		// if (ani == 4) {
		// conejo;
		// gato;
		// perro;
		// pez;
		// }
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

	public int getCodigo() {
		// TODO Auto-generated method stub
		return 0;
	}

	public int getPrePosX() {
		// TODO Auto-generated method stub
		return 0;
	}

	public int getPrePosY() {
		// TODO Auto-generated method stub
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
}
