package aps.bridge.implementations;

public class Email implements ModoEnvio {

	@Override
	public void enviar(String msg) {
		System.out.println("Enviando por email: " + msg);
	}
}
