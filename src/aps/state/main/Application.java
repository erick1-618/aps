package aps.state.main;

import aps.state.context.Context;

public class Application {
	public static void main(String[] args) {
		Context context = new Context();
		
		context.next();
		context.next();
		context.prev();
		context.next();
	}
}
