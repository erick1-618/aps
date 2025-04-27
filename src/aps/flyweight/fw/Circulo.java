package aps.flyweight.fw;

/**
 * Represent o flyweight
 *
 */

public class Circulo {
	
	/**
	 * Atributo a ser compartilhado
	 */
	private String cor;
	
	public Circulo(String cor) {
		this.cor = cor;
	}
	
	/**
	 * 
	 * @param x atributo variado
	 * @param y atributo variado
	 * @param raio atributo variado
	 */
	public void desenhar(int x, int y, int raio) {
		System.out.println("Desenhando um círculo de cor " + cor + x + y + raio);
	}
}
