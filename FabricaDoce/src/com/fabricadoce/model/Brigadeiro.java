package com.fabricadoce.model;

public class Brigadeiro extends Doce{

	public Double PesoChocolate;

	public Double getPesoChocolate() {
		return PesoChocolate;
	}

	public void setPesoChocolate(Double pesoChocolate) {
		PesoChocolate = pesoChocolate;
	}
	
	public void retornarDadosString()
	{
		System.out.println("Nome do brigadeiro: " + getNomeDoce() + "\nPeso do açucar: " + getPesoAcucar() + "\nPeso do chocolate: " + getPesoChocolate());
	}

	public String retornarDadosStringReturn()
	{
		return "Nome do brigadeiro: " + getNomeDoce() + "\nPeso do açucar: " + getPesoAcucar() + "\nPeso do chocolate: " + getPesoChocolate();
	}
	
	public double retornarPesoTotal()
	{
		double pesoTotal = getPesoAcucar() + getPesoChocolate();
		
		return pesoTotal;
	}
}
