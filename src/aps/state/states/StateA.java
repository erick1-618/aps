package aps.state.states;

import aps.state.context.Context;

public class StateA implements State{

	private Context context;
	
	public StateA(Context context) {
		super();
		this.context = context;
	}

	@Override
	public void prev() {
		System.out.println("Changing from A to C");
		this.context.setState(new StateC(context));
	}

	@Override
	public void next() {
		System.out.println("Changing from A to B");
		this.context.setState(new StateB(context));
	}

}
