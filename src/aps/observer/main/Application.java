package aps.observer.main;

import aps.observer.context.Noticiario;
import aps.observer.listeners.BigTech;
import aps.observer.listeners.Pessoa;

public class Application {
	public static void main(String[] args) {
		Noticiario noticiario = new Noticiario();
		Pessoa p1 = new Pessoa("Márcia");
		Pessoa p2 = new Pessoa("João");
		BigTech bt = new BigTech("Apple");
		BigTech bt2 = new BigTech("Amazon");
		
		//Adicionando todos os observadores na lista do contexto
		
		noticiario.addListener(bt);
		noticiario.addListener(bt2);
		noticiario.addListener(p1); 
		noticiario.addListener(p2); 
		
		noticiario.notifyListeners("a Microsoft faliu"); //Cada observador irá reagir à essa mensagem conforme a sua respectiva implementação
	}
}
