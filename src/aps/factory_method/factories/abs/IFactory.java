package aps.factory_method.factories.abs;

import aps.factory_method.products.abs.AbstractProduct;

// Define a interface com o Factory Method
public interface IFactory {
	
	/**
	 *	Define a classe comum na qual todos os objetos produzidos irão herdar
	 * 
	 * @return O objeto que a fábrica produz
	 */
	
	public AbstractProduct construct();
}
