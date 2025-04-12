package aps.builder.builders;

import aps.builder.product.Lanche;

public interface LancheBuilder {
	void adicionarPao();
    void adicionarCarne();
    void adicionarQueijo();
    void adicionarMolho();
    public Lanche construir();
}
