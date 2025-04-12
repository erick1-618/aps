package aps.builder.main;

import aps.builder.builders.LancheBuilder;
import aps.builder.builders.LancheChurrascoBuilder;
import aps.builder.builders.LancheVeganoBuilder;
import aps.builder.director.LancheDirector;
import aps.builder.product.Lanche;

public class Application {
	public static void main(String[] args) {
		
		// Construindo um lanche de churrasco
		LancheBuilder churrascoBuilder = new LancheChurrascoBuilder();
        LancheDirector director = new LancheDirector(churrascoBuilder);
        Lanche lancheChurrasco = director.construirLanche();
        lancheChurrasco.mostrar();  

        // Construindo um lanche vegano
        LancheBuilder veganoBuilder = new LancheVeganoBuilder();
        director = new LancheDirector(veganoBuilder);
        Lanche lancheVegano = director.construirLanche();
        lancheVegano.mostrar();
	}
}
