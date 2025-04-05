package aps.factory_method.factories.abs;

import aps.factory_method.products.abs.AbstractProduct;

/**
* Define a inteface que todas as fábricas devem seguir.
* De acordo com o trabalho, esta deve implementar uma fábrica de personagens de RPG, onde cada fábrica produzirá uma raça
* com todas elas respondendo também a uma interface comum (IPersonagem por exemplo)
*/

public interface IFactory {
	
	/**
	 *	Define a classe comum na qual todos os objetos produzidos irão herdar
	 * 
	 * @return O objeto que a fábrica produz
	 */
	
	public AbstractProduct construct();
}
