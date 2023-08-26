package br.com.construtora.model;

public class Apartamento extends Residencia {

	private int andar;

	public int getAndar() {
		return andar;
	}

	public void setAndar(int andar) {
		this.andar = andar;
	}
	
	public void mostrarAtributos() {
		
		System.out.println("Nome do Apartamento: " + getNome() +
				"\nMetros quadrados construído: " + getMetrosQuadradosConstruido() +
				"\nMetros quadrados do terreno: " + getMetrosQuadradosTerreno() +
				"\nAndar: " + getAndar()
				);
	}
}
