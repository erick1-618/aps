package aps.abstract_factory.factories.abs;

import aps.abstract_factory.products.abs.AbstractProduct1;
import aps.abstract_factory.products.abs.AbstractProduct2;

/**
 * Classe chave que define o comportamento criacional desse desgin pattern,
 * denotando os tipos de objetos que toda implementação dessa fábrica deve criar
 */

public interface AbstractFactory {
	
	public AbstractProduct1 constructProduct1();
	public AbstractProduct2 constructProduct2();
}
