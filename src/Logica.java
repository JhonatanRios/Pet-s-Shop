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

	public Logica(PApplet app) {
		inicio();
	}

	private void inicio() {
		for (int i = 0; i < 10; i++) {
			int randomX = (int) (Math.random() * 750 + 50);
			int randomY = (int) (Math.random() * 250 + 300);
			compa.add(new Compa(0, randomX, randomY));
			compa.add(new Compa(0, randomX, randomY));
			compa.add(new Compa(0, randomX, randomY));
			compa.add(new Compa(0, randomX, randomY));
			compa.add(new Compa(0, randomX, randomY));
			compa.add(new Compa(0, randomX, randomY));
			compa.add(new Compa(0, randomX, randomY));
			compa.add(new Compa(0, randomX, randomY));
			compa.add(new Compa(0, randomX, randomY));
			compa.add(new Compa(0, randomX, randomY));
			compa.add(new Compa(0, randomX, randomY));
			compa.add(new Compa(0, randomX, randomY));
		}

		for (int i = 0; i < 6; i++) {

			int randomX = (int) (Math.random() * 750 + 50);
			int randomY = (int) (Math.random() * 250 + 300);

			guia.add(new Guia(app, i, 0, randomX, randomY));
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

			break;

		case 1:

			app.image(panta[1], 0, 0);

			break;
		}
	}

	public void pres(int mouseX, int mouseY) {

	}

	public void mover(int mouseX, int mouseY) {

	}

	public void soltar() {
		seleccionar = null;
	}

	public void creaGuia(PApplet app, int mouseX, int mouseY) {
		if ((app.mouseButton == PConstants.LEFT)) {
			int ani = (int) (Math.random() * 0 + 5);
			guia.add(new Guia(app, ani, 0, mouseX, mouseY));
		}
	}

	public void creaCompa(PApplet app, int mouseX, int mouseY) {
		if ((app.mouseButton == PConstants.RIGHT)) {
			int ani = (int) (Math.random() * 0 + 5);
			compa.add(new Compa(ani, mouseX, mouseY));
		}
	}

}
