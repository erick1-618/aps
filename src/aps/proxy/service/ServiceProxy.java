package aps.proxy.service;

import java.util.Random;

public class ServiceProxy implements Service{

	private RealService realService;
	
	private int magicNum;

	private ServiceProxy(RealService rs) {
		this.realService = rs;
	}

	public static ServiceProxy getProxy() {
		return new ServiceProxy(new RealService());
	}
	
	@Override
	public void execute() {
		Random r = new Random();
		magicNum = r.nextInt(100);
		if(magicNum >= 50) {
			this.realService.execute();
		}
		else {
			System.out.println("Serviço não disponível");
		}
	}
}
