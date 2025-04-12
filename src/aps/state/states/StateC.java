package aps.state.states;

import aps.state.context.Context;

public class StateC implements State{

	private Context context;
	
	public StateC(Context context) {
		super();
		this.context = context;
	}

	@Override
	public void prev() {
		System.out.println("Changing from C to B");
		this.context.setState(new StateB(context));
	}

	@Override
	public void next() {
		System.out.println("Changing from C to A");
		this.context.setState(new StateA(context));
	}

}