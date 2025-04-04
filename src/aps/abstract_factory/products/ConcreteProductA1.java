package aps.abstract_factory.products;

import aps.abstract_factory.products.abs.AbstractProduct1;

/**
 * Implementação A do primeiro tipo de objeto da fábrica abstrata
 */

public class ConcreteProductA1 extends AbstractProduct1{

	@Override
	public String doString() {
		return "Imp A for product 1";
	}

}
