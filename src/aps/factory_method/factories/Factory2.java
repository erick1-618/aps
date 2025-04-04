package aps.factory_method.factories;

import aps.factory_method.factories.abs.IFactory;
import aps.factory_method.products.Product2;
import aps.factory_method.products.abs.AbstractProduct;

/**
 * Fábrica que produz objetos do tipo Product2.
 * Implementa o factory method
 */

public class Factory2 implements IFactory{

	@Override
	public AbstractProduct construct() {
		return new Product2();
	}

}
