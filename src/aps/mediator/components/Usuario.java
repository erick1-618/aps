package aps.mediator.components;

import aps.mediator.med.Mediador;

/**
 * Implementação do component Colega
 *
 */

public class Usuario extends Colega{

	private String nome;

	public Usuario(Mediador m, String nome) {
		super(m);
		this.nome = nome;
	}
	
	public void enviar(String message) {
		System.out.println(nome + " enviando " + message);
		mediator.enviar(message, this);
	}
	
	public void receber(String message) {
		System.out.println(nome + " recebeu " + message);
	}
}
