package aps.state.states;

import aps.state.context.Context;

public class StateB implements State{

	private Context context;
	
	public StateB(Context context) {
		super();
		this.context = context;
	}

	@Override
	public void prev() {
		System.out.println("Changing from B to A");
		this.context.setState(new StateA(context));
	}

	@Override
	public void next() {
		System.out.println("Changing from B to C");
		this.context.setState(new StateC(context));
	}

}
