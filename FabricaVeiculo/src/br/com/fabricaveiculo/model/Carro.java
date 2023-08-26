package br.com.fabricaveiculo.model;

public class Carro extends Veiculo {

	public int quantidadePortas;
	
	public double pesoEngate;
	
	public int getQuantidadePortas() {
		return quantidadePortas;
	}

	public void setQuantidadePortas(int quantidadePortas) {
		this.quantidadePortas = quantidadePortas;
	}

	public double getPesoEngate() {
		return pesoEngate;
	}
	
	public void setPesoEngate(double pesoEngate) {
		this.pesoEngate = pesoEngate;
	}

	public void mostrarAtributos()
	{
		System.out.println("Modelo do carro: " + getModelo() + "\nPeso do carro: " + getPeso() + "\nQuantidade de portas: " + getQuantidadePortas() + "\nPeso do engate: " + getPesoEngate());
	}
	
	public double retornarPesoTotal()
	{
		double pesoTotal = getPeso() + getPesoEngate();
		return pesoTotal;
	}
}
