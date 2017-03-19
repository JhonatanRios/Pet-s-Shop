import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Contenedor {

	private ArrayList<Compa> compas;
	private int contadorUno;
	private int contadorDos;
	private int contadorTres;
	private int contadorCuatro;
	private int contadorCinco;

	public Contenedor() {
		compas = new ArrayList<Compa>();
	}

	public void atraparParticula(Compa compaPeque) {

		if (compas.add(compaPeque)) {

			if (compaPeque instanceof EnanaBlanca) {
				contadorUno++;
			}
			if (compaPeque instanceof EnanaRoja) {
				contadorDos++;
			}
			if (compaPeque instanceof EnanaAmarilla) {
				contadorTres++;
			}
			if (compaPeque instanceof EnanaAzul) {
				contadorCuatro++;
			}
			if (compaPeque instanceof EnanaPeculiar) {
				contadorCinco++;
			}
		}
	}

	public void pintar() {
		for (int i = 0; i < compas.size(); i++) {
			compas.get(i).setX(974);
			compas.get(i).setY(111 + (25 * i));
			compas.get(i).pintarDos();
		}
	}

	public ArrayList<Compa> getEstrellas() {
		return compas;
	}

	public void remover() {
		for (Compa compa1 : compas) {
			compa1.setX(compa1.getPrePosX());
			compa1.setY(compa1.getPrePosY());
		}
		compas.clear();

	}

	public void ordenar() {
		Collections.sort(compas);
	}

	public void ordenarRevez() {
		Collections.sort(compas, new Alrevez());

	}

	public int getContadorUno() {
		return contadorUno;
	}

	public int getContadorDos() {
		return contadorDos;
	}

	public int getContadorTres() {
		return contadorTres;
	}

	public int getContadorCuatro() {
		return contadorCuatro;
	}

	public int getContadorCinco() {
		return contadorCinco;
	}

	public void setContadorUno(int contadorUno) {
		this.contadorUno = contadorUno;
	}

	public void setContadorDos(int contadorDos) {
		this.contadorDos = contadorDos;
	}

	public void setContadorTres(int contadorTres) {
		this.contadorTres = contadorTres;
	}

	public void setContadorCuatro(int contadorCuatro) {
		this.contadorCuatro = contadorCuatro;
	}

	public void setContadorCinco(int contadorCinco) {
		this.contadorCinco = contadorCinco;
	}
}
