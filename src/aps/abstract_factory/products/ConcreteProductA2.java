package aps.abstract_factory.products;

import aps.abstract_factory.products.abs.AbstractProduct2;

/**
 * Implementação A do segundo tipo de objeto da fábrica abstrata
 */

public class ConcreteProductA2 extends AbstractProduct2{

	@Override
	public String doString2() {
		return "Imp A for product 2";
	}

}
