package aps.factory_method.main;

import aps.factory_method.factories.Factory1;
import aps.factory_method.factories.Factory2;
import aps.factory_method.factories.abs.IFactory;
import aps.factory_method.products.abs.AbstractProduct;

public class Application {

	public static void main(String[] args) {
		
		//Example of application
		
		IFactory factory = new Factory1();
		
		AbstractProduct product = factory.construct();
		
		product.doSomething();
		
		factory = new Factory2();
		
		product = factory.construct();
		
		product.doSomething();
	}
}
