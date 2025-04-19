package aps.adapter.main;

import aps.adapter.service.CarroCombustao;
import aps.adapter.service.CarroCombustaoAdapter;

public class Application {
	public static void main(String[] args) {
		CarroCombustao carro = new CarroCombustao();
		
		CarroCombustaoAdapter adapter = new CarroCombustaoAdapter(carro);
		
		adapter.carregar(20);
	}
}
