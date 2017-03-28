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
	private PImage[] panta;
	private PImage[] recog;
	private ArrayList<Guia> guia = new ArrayList<Guia>();
	private ArrayList<Compa> compa = new ArrayList<Compa>();
	private ArrayList<Compa> removidos = new ArrayList<Compa>();
	private int contador0, contador1, contador2, contador3, contador4, contador;
	private Guia g;

	public Logica(PApplet app) {
		this.app = app;
		inicio();
	}

	private void inicio() {

		panta = new PImage[4];
		recog = new PImage[5];

		panta[0] = app.loadImage("../data/Inicio.png");
		panta[1] = app.loadImage("../data/Juego.png");
		panta[2] = app.loadImage("../data/Start1.png");
		panta[3] = app.loadImage("../data/Start2.png");

		recog[0] = app.loadImage("../data/recoCerdo.png");
		recog[1] = app.loadImage("../data/recoConejo.png");
		recog[2] = app.loadImage("../data/recoGato.png");
		recog[3] = app.loadImage("../data/recoPerro.png");
		recog[4] = app.loadImage("../data/recoPez.png");

		contador0 = 0;
		contador1 = 0;
		contador2 = 0;
		contador3 = 0;
		contador4 = 0;
		contador = 0;

		guia.add(new Guia(app, (int) app.random(360, 950), (int) app.random(50, 550), 0));
		guia.add(new Guia(app, (int) app.random(360, 950), (int) app.random(50, 550), 1));
		guia.add(new Guia(app, (int) app.random(360, 950), (int) app.random(50, 550), 2));
		guia.add(new Guia(app, (int) app.random(360, 950), (int) app.random(50, 550), 3));
		guia.add(new Guia(app, (int) app.random(360, 950), (int) app.random(50, 550), 4));

		for (int j = 0; j < 10; j++) {
			for (int i = 0; i < 5; i++) {
				compa.add(new Compa(recog, i, app));
			}
		}
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
		for (Compa b : compa) {
			b.pintar();
		}

		for (Guia g : guia) {
			g.pintar();
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
				if (contador <= 9) {
					if (app.dist(elementoO.getX(), elementoO.getY(), reco.getX(), reco.getY()) <= 30) {
						var = reco.getAni();
						compa.remove(reco);
						removidos.add(reco);

						switch (var) {
						case 0:
							contador0++;
							break;
						case 1:
							contador1++;
							break;
						case 2:
							contador2++;
							break;
						case 3:
							contador3++;
							break;
						case 4:
							contador4++;
							break;
						}

					}
					contador += 1;
				}
			}
		}

		// Para colocar en removidos

		for (int a = 0, fila = 0, col = 0; a < removidos.size(); a++, col++) {
			if (col > 0) {
				col = 0;
				fila++;
			}

			if (fila <= 9) {
				Compa n = removidos.get(a);
				n.pintarDos(35 + (col * 30), 160 + (fila * 30));
			}
		}

		contador += 1;
	}

	public void tecla() {
		if (pantalla == 1) {
			if (app.key == '1') {
				Collections.sort(removidos);
			}

			if (app.key == ' ') {
				for (int j = 0; j < removidos.size(); j++) {
					Compa reco = removidos.get(j);

					compa.addAll(removidos);

					if (reco.getAni() == 0) {
						removidos.remove(j);
						contador0 -= 1;
					}

					if (reco.getAni() == 1) {
						removidos.remove(j);
						contador1 -= 1;
					}

					if (reco.getAni() == 2) {
						removidos.remove(j);
						contador2 -= 1;
					}

					if (reco.getAni() == 3) {
						removidos.remove(j);
						contador3 -= 1;
					}

					if (reco.getAni() == 4) {
						removidos.remove(j);
						contador4 -= 1;
					}
					removidos.remove(j);
					removidos.clear();
				}
			}
		}
	}

	public void pres(int mouseX, int mouseY) {
		for (int i = 0; i < this.guia.size(); i++) {
			if (guia.get(i).validar(mouseX, mouseY)) {
				this.g = this.guia.get(i);
				break;
			}
		}
	}

	public void mover(int mouseX, int mouseY) {
		g.mover(mouseX, mouseY);
	}

}
