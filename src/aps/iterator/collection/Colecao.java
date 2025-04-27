package aps.iterator.collection;

import aps.iterator.it.Iterator;

/**
 * Representa a interface padrão para as coleções da aplicação. Semelhante a
 * Collection
 *
 * @param <T>
 */
public interface Colecao<T> {
	Iterator<T> criarIterator();
}
