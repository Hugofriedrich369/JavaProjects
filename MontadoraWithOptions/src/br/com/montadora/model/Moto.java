package br.com.montadora.model;

public class Moto extends Veiculo {

	private int quantidadeAdesivos;

	public int getQuantidadeAdesivos() {
		return quantidadeAdesivos;
	}

	public void setQuantidadeAdesivos(int quantidadeAdesivos) {
		this.quantidadeAdesivos = quantidadeAdesivos;
	}
	
	public String mostrarAtributos() {
		return "O modelo da moto é: " + getModelo() + "."
				+ "\nO peso da moto é: " + getPeso() + " Kg."
				+ "\nA moto possui " + getQuantidadeAdesivos() + " adesivos.";
	}
}
