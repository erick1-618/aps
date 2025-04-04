package aps.factory_method.products;

import aps.factory_method.products.abs.AbstractProduct;

/**
 * Implementação 1 do produto abstrato
 */

public class Product1 extends AbstractProduct {

	@Override
	public void doSomething() {
		System.out.println("Imp 1");
	}

}
