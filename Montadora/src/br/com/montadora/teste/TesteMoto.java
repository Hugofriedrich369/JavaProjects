package br.com.montadora.teste;

import javax.swing.JOptionPane;

import br.com.montadora.model.Moto;

public class TesteMoto {

	public static void main(String[] args) {

		Moto moto = new Moto();
		moto.setModelo(JOptionPane.showInputDialog("Qual o modelo da moto?"));
		moto.setPeso(Double.parseDouble(JOptionPane.showInputDialog("Qual o peso da moto?")));
		moto.setQuantidadeAdesivos(Integer.parseInt(JOptionPane.showInputDialog("Quantos adesivos possui?")));
		
		
		System.out.println(moto.mostrarAtributos());
	
	}

}
