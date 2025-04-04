package aps.decorator.component.interfaces;

/**
 * Define a interface do decorator do Hambúrguer. Contém o hamburguer base que ele vai envelopar, que por sua vez, pode ser um decorator também
 */

public abstract class HamburguerDecorator implements Hamburguer{

	protected Hamburguer base;

	public HamburguerDecorator(Hamburguer base) {
		this.base = base;
	}
	
	@Override
	public String hamburguerString() {
		return this.base.hamburguerString();
	}

}
