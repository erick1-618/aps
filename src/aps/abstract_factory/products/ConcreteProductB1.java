package aps.abstract_factory.products;

import aps.abstract_factory.products.abs.AbstractProduct1;

/**
 * Implementação B do primeiro tipo de objeto da fábrica abstrata
 */

public class ConcreteProductB1 extends AbstractProduct1{

	@Override
	public String doString() {
		return "Imp B for product 1";
	}

}
