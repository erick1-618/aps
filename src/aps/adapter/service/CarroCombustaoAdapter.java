package aps.adapter.service;

public class CarroCombustaoAdapter implements CarroEletrico{

	private CarroCombustao carro;
	
	public CarroCombustaoAdapter(CarroCombustao c) {
		this.carro = c;
	}
	
	@Override
	public void carregar(int porcentagem) {
		System.out.println("Carregando o carro (entre aspas)");
		carro.abaster(porcentagem);
	}
}
