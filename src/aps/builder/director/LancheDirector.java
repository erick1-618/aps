package aps.builder.director;

import aps.builder.builders.LancheBuilder;
import aps.builder.product.Lanche;

public class LancheDirector {
	private LancheBuilder builder;

    public LancheDirector(LancheBuilder builder) {
        this.builder = builder;
    }

    public Lanche construirLanche() {
        builder.adicionarPao();
        builder.adicionarCarne();
        builder.adicionarQueijo();
        builder.adicionarMolho();
        return builder.construir();
    }
}
