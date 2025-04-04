package aps.abstract_factory.main;

import aps.abstract_factory.factories.FactoryA;
import aps.abstract_factory.factories.FactoryB;
import aps.abstract_factory.factories.abs.AbstractFactory;
import aps.abstract_factory.products.abs.AbstractProduct1;
import aps.abstract_factory.products.abs.AbstractProduct2;

public class Application {

	public static void main(String[] args) {

		// Application Example

		AbstractFactory factory = new FactoryA();

		AbstractProduct1 p1 = factory.constructProduct1();

		AbstractProduct2 p2 = factory.constructProduct2();

		System.out.println(p1.doString());

		System.out.println(p2.doString2());

		factory = new FactoryB();

		p1 = factory.constructProduct1();

		p2 = factory.constructProduct2();

		System.out.println(p1.doString());

		System.out.println(p2.doString2());
		
		interFactory(p1, p2);
		
		factory = new FactoryA();
		
		p1 = factory.constructProduct1();
		
		interFactory(p1, p2);
	}

	/**
	 * Este exemplo mostra como objetos de fábricas diferentes podem interagir entre
	 * si
	 * 
	 */

	public static void interFactory(AbstractProduct1 p1, AbstractProduct2 p2) {
		System.out.println(p1.getClass().getSimpleName() + " object interacting with " + p2.getClass().getSimpleName());
	}
}
