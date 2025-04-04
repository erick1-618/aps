package aps.strategy.strategies.abs;

import aps.strategy.context.ContextObject;

/**
 * Define a interface na qual todas as estratégias estarão implementando
 * 
 */

public interface Strategy {
	
	/**
	 * 
	 * @param obj Objeto do contexto, no qual a estratégia estará aplicando o algoritmo. Esse parâmetro não é obrigatório
	 * Poderiam haver vários, ou nenhum. Depende do contexto na qual essa estratégia está inserida.
	 */
	
	public void doSomething(ContextObject obj);
}
