package br.com.montadora.teste;

import javax.swing.JOptionPane;

import br.com.montadora.model.Carro;

public class TesteCarro {

	public static void main(String[] args) {

		Carro carro = new Carro();
		carro.setModelo(JOptionPane.showInputDialog("Qual o modelo do carro?"));
		carro.setPeso(Double.parseDouble(JOptionPane.showInputDialog("Qual o peso do carro?")));
		carro.setQuantidadePortas(Integer.parseInt(JOptionPane.showInputDialog("Quantas portas o carro possuí?")));
	
		System.out.println(carro.mostrarAtributos());
		
	}

}
