package aps.strategy.strategies;

import java.util.Objects;

import aps.strategy.context.ContextObject;
import aps.strategy.strategies.abs.Strategy;

/**
 * Primeira implementação de Strategy
 */

public class StrategyImp1 implements Strategy{

	@Override
	public void doSomething(ContextObject obj) {
		
		int number = Objects.hash(obj.getProp1(), obj.getProp2(), obj.getProp3());
		
		System.out.println("Strategy 1 has returned " + number);
	}

}
