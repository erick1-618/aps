package aps.bridge.main;

import aps.bridge.abstractions.*;
import aps.bridge.implementations.*;

public class Application {
	public static void main(String[] args) {
		//Implementações
		ModoEnvio sms = new SMS();
		ModoEnvio email = new Email();
		
		Mensagem m = new MensagemNormal(email);
		m.enviar("Oi, tudo bem?");
		
		m = new MensagemUrgente(sms);
		m.enviar("DEPES informa: cancelamento das aulas no dia "
				+ "\n17/04 por conta dos alertas metereológicos");
		
		m.setModoEnvio(email);
		m.enviar("DEPES informa: cancelamento das aulas no dia "
				+ "\n17/04 por conta dos alertas metereológicos");
	}
}
