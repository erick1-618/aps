package aps.mediator.components;

import aps.mediator.med.Mediador;

/**
 * Representa o component
 */

public abstract class Colega {
	protected Mediador mediator;
	public Colega(Mediador m) {
		this.mediator = m;
	}
	public abstract void receber(String Message);
}
