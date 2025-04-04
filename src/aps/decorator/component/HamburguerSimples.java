package aps.decorator.component;

import aps.decorator.component.interfaces.Hamburguer;

/**
 * Componente concreto básico, que poderá ser envolto pelos decorators
 */

public class HamburguerSimples implements Hamburguer{

	@Override
	public String hamburguerString() {
		return "Um hamburguer simples";
	}
}
