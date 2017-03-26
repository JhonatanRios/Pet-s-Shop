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
	// private Contenedor contenedorU;

	public Logica(PApplet app) {
		this.app = app;
		inicio();
	}

	private void inicio() {
		// contenedorU = new Contenedor();

		panta[0] = app.loadImage("../data/Inicio.png");
		panta[1] = app.loadImage("../data/Juego.png");
		panta[2] = app.loadImage("../data/Start1.png");
		panta[3] = app.loadImage("../data/Start2.png");

		// for (int i = 0; i < 5; i++) {
		// compa.add(new CompaCerdo(app));
		// compa.add(new CompaConejo(app));
		// compa.add(new CompaGato(app));
		// compa.add(new CompaPerro(app));
		// compa.add(new CompaPez(app));
		// }

		// guia.add(new Cerdo(app));
		// guia.add(new Conejo(app));
		// guia.add(new Gato(app));
		// guia.add(new Perro(app));
		// guia.add(new Pez(app));

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

	public void pres(int mouseX, int mouseY) {
		if (mouseX >= 43 && mouseX <= 77 && mouseY >= 146 && mouseY <= 156) {
			int randomX = (int) (Math.random() * 750 + 50);
			int randomY = (int) (Math.random() * 250 + 300);
			//guia.add(new Guia(app, 0, 0, randomX, randomY));
		}
	}

	public void pantalla() {
		if (app.mouseX >= 416 && app.mouseX <= 583 && app.mouseY >= 487 && app.mouseY <= 525) {
			pantalla = 1;
		}
	}

	public void tecla() {
		// if (pantalla == 1) {
		// if (app.key == '1') {
		// contenedorU.ordenar();
		// }
		//
		// if (app.key == '2') {
		// contenedorU.ordenarRevez();
		// }
		// if (app.key == ' ') {
		// compa.addAll(contenedorU.getCompa());
		// contenedorU.remover();
		// contenedorU.setContadorUno(0);
		// contenedorU.setContadorDos(0);
		// contenedorU.setContadorTres(0);
		// contenedorU.setContadorCuatro(0);
		// contenedorU.setContadorCinco(0);
		// }
		// }
	}

}
