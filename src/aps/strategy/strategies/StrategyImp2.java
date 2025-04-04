package aps.strategy.strategies;

import java.util.Objects;

import aps.strategy.context.ContextObject;
import aps.strategy.strategies.abs.Strategy;

/**
 * Segunda implementação de Strategy
 */

public class StrategyImp2 implements Strategy{
	
	@Override
	public void doSomething(ContextObject obj) {
		
		int number = Objects.hash(obj.getClass(), obj.getProp1());
		
		System.out.println("Strategy 2 has returned " + number);
	}

}
