package aps.mediator.med;

import java.util.ArrayList;
import java.util.List;

import aps.mediator.components.Colega;

/**
 * Implementação do Mediator
 * @author aluno
 *
 */

public class ChatMediator implements Mediador{

	private List<Colega> colegas = new ArrayList<>();
	
	public void adicionarColega(Colega colega) {
		colegas.add(colega);
	}
	
	/**
	 * Passa o remetente para notificar todos, menos ele
	 */
	
	@Override
	public void enviar(String message, Colega remetente) {
		for(Colega c : colegas) {
			if(c != remetente) 
				c.receber(message);
		}
	}
}
