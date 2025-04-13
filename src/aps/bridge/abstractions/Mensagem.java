package aps.bridge.abstractions;

import aps.bridge.implementations.ModoEnvio;

public abstract class Mensagem {
	protected ModoEnvio modo;

	public Mensagem(ModoEnvio modo) {
		this.modo = modo;
	}
	
	public void setModoEnvio(ModoEnvio modo) {
		this.modo = modo;
	}

	public abstract void enviar(String conteudo);
}
