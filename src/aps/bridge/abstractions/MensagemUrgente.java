package aps.bridge.abstractions;

import aps.bridge.implementations.ModoEnvio;

public class MensagemUrgente extends Mensagem {

	public MensagemUrgente(ModoEnvio modo) {
		super(modo);
	}

	@Override
	public void enviar(String conteudo) {
		modo.enviar("MENSAGEM URGENTE: " + conteudo.toUpperCase());
	}
}
