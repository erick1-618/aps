package aps.bridge.implementations;

public class SMS implements ModoEnvio {

	@Override
	public void enviar(String msg) {
		System.out.println("Enviando por SMS: " + msg);
	}
}
