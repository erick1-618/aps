package aps.mediator.main;

import aps.mediator.components.Usuario;
import aps.mediator.med.ChatMediator;

public class Application {
	public static void main(String[] args) {
		ChatMediator chat = new ChatMediator();
		
		Usuario joao = new Usuario(chat, "João");
		Usuario ana = new Usuario(chat, "Ana");
		Usuario jose = new Usuario(chat, "Jose");
		
		chat.adicionarColega(jose);
		chat.adicionarColega(ana);
		chat.adicionarColega(joao);
		
		joao.enviar("Oi grupo!");
	}
}
