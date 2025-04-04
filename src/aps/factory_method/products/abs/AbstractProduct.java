package aps.factory_method.products.abs;

/**
 * Classe no qual todos os objetos produzidos pelas fábricas irão herdar. Poderia ser apenas uma interface
 */

public abstract class AbstractProduct {
	
	private Object prop1;
	
	private Object prop2;
	
	private Object prop3;
	
	public abstract void doSomething();

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
}
