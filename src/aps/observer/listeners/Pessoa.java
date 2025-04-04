package aps.observer.listeners;

import aps.observer.listeners.abs.NoticiarioListener;

/**
 * Uma implementação de observador
 */

public class Pessoa implements NoticiarioListener{

	private String nome;
	
	public Pessoa(String nome) {
		this.nome = nome;
	}
	
	/**
	 * Esse método define a forma dessa classe reagir às mensagens notificadas
	 * 
	 * @param msg Conteúdo da mensagem notificada pelo context
	 */
	@Override
	public void doSomething(Object msg) {
		System.out.println(this.nome + " ficou sabendo que " + msg);
	}

}
