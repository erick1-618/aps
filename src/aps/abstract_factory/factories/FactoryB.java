package aps.abstract_factory.factories;

import aps.abstract_factory.factories.abs.AbstractFactory;
import aps.abstract_factory.products.ConcreteProductB1;
import aps.abstract_factory.products.ConcreteProductB2;
import aps.abstract_factory.products.abs.AbstractProduct1;
import aps.abstract_factory.products.abs.AbstractProduct2;

/**
 * Implemetação B da fábrica abstrata, com a linha B de produtos produzidos 
 */

public class FactoryB implements AbstractFactory{

	@Override
	public AbstractProduct1 constructProduct1() {
		return new ConcreteProductB1();
	}

	@Override
	public AbstractProduct2 constructProduct2() {
		return new ConcreteProductB2();
	}

}
