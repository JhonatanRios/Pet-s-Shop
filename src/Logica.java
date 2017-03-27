import java.util.ArrayList;
import java.util.Collections;

import processing.core.PApplet;
import processing.core.PConstants;
import processing.core.PImage;

public class Logica {

	PApplet app;
	private int pantalla, var;
	private boolean boton;
	private boolean anadir = true;
	private PImage[] panta = new PImage[4];
	private ArrayList<Guia> guia = new ArrayList<Guia>();
	private ArrayList<Compa> compa = new ArrayList<Compa>();
	private ArrayList<Compa> removidos = new ArrayList<Compa>();
	private int contador0, contador1, contador2, contador3, contador4, contador;

	public Logica(PApplet app) {
		this.app = app;
		inicio();
	}

	private void inicio() {

		panta[0] = app.loadImage("../data/Inicio.png");
		panta[1] = app.loadImage("../data/Juego.png");
		panta[2] = app.loadImage("../data/Start1.png");
		panta[3] = app.loadImage("../data/Start2.png");

		contador0 = 0;
		contador1 = 0;
		contador2 = 0;
		contador3 = 0;
		contador4 = 0;
		contador = 0;

		for (int j = 0; j < 10; j++) {
			for (int i = 0; i < 5; i++) {
				compa.add(new Compa(i, app));
			}
		}

		guia.add(new Guia(app, (int) app.random(310, 1000), (int) app.random(0, 600), 0));
		guia.add(new Guia(app, (int) app.random(310, 1000), (int) app.random(0, 600), 1));
		guia.add(new Guia(app, (int) app.random(310, 1000), (int) app.random(0, 600), 2));
		guia.add(new Guia(app, (int) app.random(310, 1000), (int) app.random(0, 600), 3));
		guia.add(new Guia(app, (int) app.random(310, 1000), (int) app.random(0, 600), 4));
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
			pintar();

			break;
		}
	}

	public void pintar() {
		for (Guia g : guia) {
			g.pintar();
		}

		for (Compa b : compa) {
			b.pintar();
		}
	}

	public void pantalla() {
		if (app.mouseX >= 416 && app.mouseX <= 583 && app.mouseY >= 487 && app.mouseY <= 525) {
			pantalla = 1;
		}
	}

	public void distancia() {
		for (int i = 0; i < guia.size(); i++) {
			Guia elementoO = guia.get(i);
			for (int j = 0; j < compa.size(); j++) {
				Compa reco = compa.get(j);

				if (app.dist(elementoO.getX(), elementoO.getY(), reco.getX(), reco.getY()) <= 30) {
					var = reco.getAni();
					compa.remove(reco);
					removidos.add(reco);
				}
			}
		}
	}

	public void tecla() {
		if (pantalla == 1) {
			if (app.key == '1') {
				Collections.sort(removidos);
			}
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
		}
	}

}
