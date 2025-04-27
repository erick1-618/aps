package aps.iterator.it;

import java.util.List;

/**
 *Implementação do iterator, compatível à collection correspondente 
 *
 * @param <T>
 */

public class ListaIterator<T> implements Iterator<T>{

	private List<T> lista;
	private int pos = 0;
	
	public ListaIterator(List<T> lista) {
		this.lista = lista;
	}
	
	@Override
	public boolean hasNext() {
		return pos < lista.size();
	}

	@Override
	public T next() {
		return lista.get(pos++);
	}
}
