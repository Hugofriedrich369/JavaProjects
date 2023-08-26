package com.fabricadoce.teste;

import com.fabricadoce.model.Brigadeiro;

public class Teste {

	public static void main(String[] args) {

		Brigadeiro brigadeiro = new Brigadeiro();
		
		brigadeiro.setNomeDoce("Brigadeiro da vovó");
		brigadeiro.setPesoAcucar(100.0);
		brigadeiro.setPesoChocolate(100.0);
		
		brigadeiro.retornarDadosString();
		
		System.out.println(brigadeiro.retornarDadosStringReturn());
		
		System.out.println(brigadeiro.retornarPesoTotal());
	}

}
