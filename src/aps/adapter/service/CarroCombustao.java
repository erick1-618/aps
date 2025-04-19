package aps.adapter.service;

public class CarroCombustao {
	
	private int combustivel = 0;
	
	public void abaster(int litros) {
		System.out.println("Abastecendo em litros");
		this.combustivel += litros;
	}
}
