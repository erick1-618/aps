package aps.strategy.context;

import aps.strategy.strategies.abs.Strategy;

/**
 * Classe que irá estar utilizando as demais estratégias, utilizando a composição
 * (possuindo atributos Strategy) ao invés de herança (Várias classes context com algoritmos diferentes)
 */

public class Context {
	
	private Strategy strategy;
	
	public Context(Strategy s) {
		this.strategy = s;
	}

	public void setStrategy(Strategy strategy) {
		this.strategy = strategy;
	}
	
	public void operate(ContextObject obj) {
		this.strategy.doSomething(obj);
	}
}
