package aps.composite.components;

import java.util.ArrayList;
import java.util.List;

public class Composite implements Component{

	private List<Component> children;
	
	private String name;
	
	public Composite(String name){
		this.name = name;
		this.children = new ArrayList<>();
	}
	
	public void addChildren(Component c) {
		this.children.add(c);
	}
	
	@Override
	public void execute() {
		System.out.println("Composite " + name + " executing");
		children.forEach(c -> c.execute());
		System.out.println("Composite " + name + " finished");
	}
}
