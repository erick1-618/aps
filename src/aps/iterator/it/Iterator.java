package aps.iterator.it;

/**
 * Interface padrão do iterator
 *
 * @param <T>
 */
public interface Iterator<T> {
	boolean hasNext();

	T next();
}
