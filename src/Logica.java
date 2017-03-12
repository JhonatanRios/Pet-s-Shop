import java.util.ArrayList;
import processing.core.PApplet;
import processing.core.PConstants;

public class Logica {

	PApplet app;
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
	}

	public void pintar(PApplet app) {

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
