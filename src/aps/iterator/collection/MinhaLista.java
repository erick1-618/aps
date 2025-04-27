package aps.iterator.collection;

import java.util.ArrayList;
import java.util.List;

import aps.iterator.it.Iterator;
import aps.iterator.it.ListaIterator;

/**
 * Implementação da Colecao
 */
public class MinhaLista<T> implements Colecao<T> {

	private List<T> itens = new ArrayList<>();

	/**
	 * Cria um iterator correspondente à implementação da collection
	 */
	@Override
	public Iterator<T> criarIterator() {
		return new ListaIterator<>(itens);
	}

	public void adicionar(T item) {
		itens.add(item);
	}
}
