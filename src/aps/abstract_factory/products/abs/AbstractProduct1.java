package aps.abstract_factory.products.abs;

/**
 * Define de forma abstrata, o primerio tipo de objecto que cada fábrica irá fabricar
 */

public abstract class AbstractProduct1 {

	private Object prop1;
	private Object prop2;
	private Object prop3;

	public Object getProp1() {
		return prop1;
	}

	public void setProp1(Object prop1) {
		this.prop1 = prop1;
	}

	public Object getProp2() {
		return prop2;
	}

	public void setProp2(Object prop2) {
		this.prop2 = prop2;
	}

	public Object getProp3() {
		return prop3;
	}

	public void setProp3(Object prop3) {
		this.prop3 = prop3;
	}

	public abstract String doString();
}
