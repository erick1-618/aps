package aps.state.context;

import aps.state.states.State;
import aps.state.states.StateA;

public class Context {

	State state;
	
	public Context() {
		this.state = new StateA(this);
	}
	
	public void prev() {
		this.state.prev();
	}
	
	public void next() {
		this.state.next();
	}

	public void setState(State state) {
		this.state = state;
	}
}
