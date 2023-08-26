package br.com.construtora.model;

public class Casa extends Residencia {

	private String tipoTelhado;

	public String getTipoTelhado() {
		return tipoTelhado;
	}

	public void setTipoTelhado(String tipoTelhado) {
		this.tipoTelhado = tipoTelhado;
	}
	
	public void mostrarAtributos() {
		
		System.out.println("Nome da Casa: " + getNome() +
				"\nMetros quadrados construído: " + getMetrosQuadradosConstruido() +
				"\nMetros quadrados do terreno: " + getMetrosQuadradosTerreno() +
				"\nTipo do telhado: " + getTipoTelhado()
				);
	}
	
	public double areaNaoConstruida() {
		double metrosQuadrados = getMetrosQuadradosTerreno() - getMetrosQuadradosConstruido();
		
		return metrosQuadrados;
	}
	
	
}
