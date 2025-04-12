package aps.builder.builders;

import aps.builder.product.Lanche;

public class LancheVeganoBuilder implements LancheBuilder {

	private Lanche lanche;

	public LancheVeganoBuilder() {
		this.lanche = new Lanche();
	}

	@Override
	public void adicionarPao() {
		lanche.setPao("Pão integral");
	}

	@Override
	public void adicionarCarne() {
		lanche.setCarne("Carne de soja");
	}

	@Override
	public void adicionarQueijo() {
		lanche.setQueijo("Queijo vegano");
	}

	@Override
	public void adicionarMolho() {
		lanche.setMolho("Molho pesto");
	}

	@Override
	public Lanche construir() {
		return lanche;
	}
}
