package aps.abstract_factory.factories;

import aps.abstract_factory.factories.abs.AbstractFactory;
import aps.abstract_factory.products.ConcreteProductA1;
import aps.abstract_factory.products.ConcreteProductA2;
import aps.abstract_factory.products.abs.AbstractProduct1;
import aps.abstract_factory.products.abs.AbstractProduct2;

/**
 * Implemetação A da fábrica abstrata, com a linha A de produtos produzidos 
 */

public class FactoryA implements AbstractFactory{

	@Override
	public AbstractProduct1 constructProduct1() {
		return new ConcreteProductA1();
	}

	@Override
	public AbstractProduct2 constructProduct2() {
		return new ConcreteProductA2();
	}

}
