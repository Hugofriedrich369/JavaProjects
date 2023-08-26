package br.com.montadora.teste;

import javax.swing.JOptionPane;

public class Teste {

	public static void main(String[] args) {

		String[] options = {"Carro", "Moto"};
		
		int x = JOptionPane.showOptionDialog(null, "Selecione um veículo:", "Montadora", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);
		System.out.println(x);
		
		if(x == 0) {
			TesteCarro.Carro();
		}
		else if(x == 1) {
			TesteMoto.Moto();
		}
	}

}
