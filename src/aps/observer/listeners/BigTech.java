package aps.observer.listeners;

import aps.observer.listeners.abs.NoticiarioListener;

/**
 * Uma implementação de observador
 */

public class BigTech implements NoticiarioListener{

	private String nome;

	/**
	 * Esse método define a forma dessa classe reagir às mensagens notificadas
	 * 
	 * @param msg Conteúdo da mensagem notificada pelo context
	 */
	
	@Override
	public void doSomething(Object msg) {
		System.out.println(this.nome + " já sabia que " + msg);	
	}

	public BigTech(String nome) {
		this.nome = nome;
	}
}
