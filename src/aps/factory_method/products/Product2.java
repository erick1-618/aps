package aps.factory_method.products;

import aps.factory_method.products.abs.AbstractProduct;

/**
 * Implementação 2 do produto abstrato
 */

public class Product2 extends AbstractProduct {

	@Override
	public void doSomething() {
		System.out.println("Imp 2");
	}
}
