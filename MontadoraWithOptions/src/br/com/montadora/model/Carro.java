package br.com.montadora.model;

public class Carro extends Veiculo {

	private int quantidadePortas;

	public int getQuantidadePortas() {
		return quantidadePortas;
	}

	public void setQuantidadePortas(int quantidadePortas) {
		this.quantidadePortas = quantidadePortas;
	}
	
	public String mostrarAtributos() {
		return "O modelo do carro é: " + getModelo() + "."
				+ "\nO peso do carro é: " + getPeso() + " Kg."
				+ "\nO carro possui " + getQuantidadePortas() + " portas.";
	}
}
