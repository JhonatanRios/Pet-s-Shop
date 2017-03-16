import java.util.ArrayList;
import processing.core.PApplet;
import processing.core.PConstants;
import processing.core.PImage;

public class Logica {

	PApplet app;
	private int pantalla;
	private boolean boton;
	private PImage[] panta = new PImage[4];;
	private Object seleccionar = null;
	private ArrayList<Guia> guia = new ArrayList<Guia>();
	private ArrayList<Compa> compa = new ArrayList<Compa>();
	private Guia g;
	private Compa c;

	public Logica(PApplet app) {
		this.app = app;
		inicio();
	}

	private void inicio() {

		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 10; j++) {
				int randomX = (int) (Math.random() * 100 + 408);
				int randomY = (int) (Math.random() * 600 + 0);
				compa.add(new Compa(i, randomX, randomY));

			}
		}

		panta[0] = app.loadImage("../data/Inicio.png");
		panta[1] = app.loadImage("../data/Juego.png");
		panta[2] = app.loadImage("../data/Start1.png");
		panta[3] = app.loadImage("../data/Start2.png");
	}

	public void pintar(PApplet app) {

		switch (pantalla) {

		case 0:

			app.image(panta[0], 0, 0);

			if (boton == false) {
				app.image(panta[2], 0, 0);
			}

			if (boton == true) {
				app.image(panta[3], 0, 0);
			}
			if (app.mouseX >= 416 && app.mouseX <= 583 && app.mouseY >= 487 && app.mouseY <= 525) {
				boton = true;
			} else {
				boton = false;
			}
			break;

		case 1:

			app.image(panta[1], 0, 0);

			break;
		}
	}

	public void mover(int mouseX, int mouseY) {

	}

	public void soltar() {
		seleccionar = null;
	}

	public void creaGuia(PApplet app, int mouseX, int mouseY) {

	}

	public void creaCompa(PApplet app, int mouseX, int mouseY) {

	}

	public void pres(int mouseX, int mouseY) {

		if (mouseX >= 43 && mouseX <= 77 && mouseY >= 146 && mouseY <= 156) {
			int randomX = (int) (Math.random() * 750 + 50);
			int randomY = (int) (Math.random() * 250 + 300);
			guia.add(new Guia(app, 0, 0, randomX, randomY));
		}

		if (mouseX >= 416 && mouseX <= 583 && mouseY >= 487 && mouseY <= 525) {
			pantalla = 1;
		}
	}

}
