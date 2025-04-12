package aps.builder.builders;

import aps.builder.product.Lanche;

public class LancheChurrascoBuilder implements LancheBuilder{
	private Lanche lanche;

	public LancheChurrascoBuilder() {
		this.lanche = new Lanche();
	}

	@Override
	public void adicionarPao() {
		lanche.setPao("Pão de alho");
	}

	@Override
	public void adicionarCarne() {
		lanche.setCarne("Carne de churrasco");
	}

	@Override
	public void adicionarQueijo() {
		lanche.setQueijo("Queijo coalho");
	}

	@Override
	public void adicionarMolho() {
		lanche.setMolho("Molho barbecue");
	}

	@Override
	public Lanche construir() {
		return lanche;
	}
}
