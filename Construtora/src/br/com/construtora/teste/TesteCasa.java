package br.com.construtora.teste;

import javax.swing.JOptionPane;

import br.com.construtora.model.Casa;

public class TesteCasa {

	public static void main(String[] args) {
		
		Casa casa = new Casa();
		
		casa.setNome(JOptionPane.showInputDialog("Qual o nome da casa?"));
		casa.setMetrosQuadradosConstruido(Double.parseDouble(JOptionPane.showInputDialog("Quantos metros construidos?")));
		casa.setMetrosQuadradosTerreno(Double.parseDouble(JOptionPane.showInputDialog("Quantos metros quadrados tem o terreno?")));
		casa.setTipoTelhado(JOptionPane.showInputDialog("Qual o tipo do telhado?"));
	
		casa.mostrarAtributos();
		System.out.println(casa.areaNaoConstruida());
	}

}
