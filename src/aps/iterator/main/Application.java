package aps.iterator.main;

import aps.iterator.collection.MinhaLista;
import aps.iterator.it.Iterator;

public class Application {
	public static void main(String[] args) {
		MinhaLista<String> nomes = new MinhaLista<>();
		
		nomes.adicionar("Erick");
		nomes.adicionar("Erich");
		
		Iterator<String> it = nomes.criarIterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}
}
