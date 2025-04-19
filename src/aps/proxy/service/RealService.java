package aps.proxy.service;

public class RealService implements Service{

	@Override
	public void execute() {
		System.out.println("Serviço real sendo utilizado");	
	}
}
