package aps.factory_method.factories;

import aps.factory_method.factories.abs.IFactory;
import aps.factory_method.products.Product1;
import aps.factory_method.products.abs.AbstractProduct;

/**
 * Fábrica que produz objetos do tipo Product1.
 * Implementa o factory method
 */

public class Factory1 implements IFactory{

	@Override
	public AbstractProduct construct() {
		return new Product1();
	}

}
