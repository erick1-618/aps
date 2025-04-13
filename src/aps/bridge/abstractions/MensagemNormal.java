package aps.bridge.abstractions;

import aps.bridge.implementations.ModoEnvio;

public class MensagemNormal extends Mensagem {

	public MensagemNormal(ModoEnvio modo) {
		super(modo);
	}

	@Override
	public void enviar(String conteudo) {
		modo.enviar("Mensagem comum: " + conteudo);
	}
}
