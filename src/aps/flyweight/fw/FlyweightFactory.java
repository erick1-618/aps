package aps.flyweight.fw;

import java.util.HashMap;
import java.util.Map;

public class FlyweightFactory {

	private Map<String, Circulo> circulos = new HashMap<>();
	
	/**
	 * Verifica se já existe um círculo com a cor correspondente. Se sim, retorna o
	 * círculo existente, senão cria outro
	 * 
	 * @param cor Representa o atributo "pesado"
	 * @return
	 */
	
	public Circulo getCirculo(String cor) {
		if(!circulos.containsKey(cor)) {
			circulos.put(cor, new Circulo(cor));
		}
		return circulos.get(cor);
	}
}
