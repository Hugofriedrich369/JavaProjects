package br.com.fabricaveiculo.teste;

import br.com.fabricaveiculo.model.Carro;

public class Teste {

	public static void main(String[] args) {

		Carro carro = new Carro();
		
		carro.setModelo("Lancer");
		carro.setPeso(120.0);
		carro.setQuantidadePortas(4);
		carro.setPesoEngate(120.0);
		
		carro.mostrarAtributos();
		System.out.println("\nPeso Total: " + carro.retornarPesoTotal());

	}

}
