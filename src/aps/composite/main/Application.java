package aps.composite.main;

import aps.composite.components.Composite;
import aps.composite.components.Simple;

public class Application {
	public static void main(String[] args) {
		Simple leaf1 = new Simple();
		Simple leaf2 = new Simple();
		Simple leaf3 = new Simple();
		Composite comp1 = new Composite("A");
		Composite comp2 = new Composite("B");
		Composite comp3 = new Composite("C");
		comp1.addChildren(leaf1);
		comp2.addChildren(leaf2);
		comp2.addChildren(leaf3);
		comp3.addChildren(comp1);
		comp3.addChildren(comp2);
		comp3.addChildren(leaf1);
		comp3.execute();
	}
}
