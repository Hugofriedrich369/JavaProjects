package br.com.construtora.teste;

import javax.swing.JOptionPane;

import br.com.construtora.model.Apartamento;

public class TesteApartamento {
	public static void main(String[] args) {
	
		Apartamento apartamento = new Apartamento();
		
		apartamento.setNome(JOptionPane.showInputDialog("Qual o nome do apartamento?"));
		apartamento.setMetrosQuadradosConstruido(Double.parseDouble(JOptionPane.showInputDialog("Quantos metros construidos?")));
		apartamento.setMetrosQuadradosTerreno(Double.parseDouble(JOptionPane.showInputDialog("Quantos metros quadrados tem o terreno?")));
		apartamento.setAndar(Integer.parseInt(JOptionPane.showInputDialog("Qual o andar?")));
		
		apartamento.mostrarAtributos();
	}
}
