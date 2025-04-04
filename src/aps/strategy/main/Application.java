package aps.strategy.main;

import java.util.Date;

import aps.strategy.context.Context;
import aps.strategy.context.ContextObject;
import aps.strategy.strategies.StrategyImp1;
import aps.strategy.strategies.StrategyImp2;

public class Application {
	public static void main(String[] args) {
		
		Context cont = new Context(new StrategyImp1());
		
		ContextObject obj = new ContextObject();
		
		obj.setProp1("ABC");
		obj.setProp1(new Date());
		obj.setProp1(Math.PI);
		
		cont.operate(obj);
		
		// Ponto chave do Design Pattern
		// Aqui pode-se perceber a intercambiação de diferentes estratégias em tempo de execução
		cont.setStrategy(new StrategyImp2());
		
		cont.operate(obj);
	}
}
