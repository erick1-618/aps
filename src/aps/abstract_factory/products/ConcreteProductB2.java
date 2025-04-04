package aps.abstract_factory.products;

import aps.abstract_factory.products.abs.AbstractProduct2;

/**
 * Implementação B do segundo tipo de objeto da fábrica abstrata
 */

public class ConcreteProductB2 extends AbstractProduct2{

	@Override
	public String doString2() {
		return "Imp B for product 2";
	}

}
