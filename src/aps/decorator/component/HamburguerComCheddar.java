package aps.decorator.component;

import aps.decorator.component.interfaces.Hamburguer;
import aps.decorator.component.interfaces.HamburguerDecorator;

/**
 * Implementação do decorator do Hambúrguer, extende o método hamburguerString
 */

public class HamburguerComCheddar extends HamburguerDecorator{

	public HamburguerComCheddar(Hamburguer base) {
		super(base);
	}

	@Override
	public String hamburguerString() {
		return super.hamburguerString() + " + cheddar";
	}
}
