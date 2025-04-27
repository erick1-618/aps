package aps.flyweight.main;

import aps.flyweight.fw.Circulo;
import aps.flyweight.fw.FlyweightFactory;

public class Application {
	public static void main(String[] args) {
		FlyweightFactory factory = new FlyweightFactory();
		
		// Cria círculos com cores compartilhadas
		Circulo circuloVermelho = new Circulo("vermelho");
		Circulo circuloAzul = new Circulo("azul");
		Circulo circuloVerde = new Circulo("verde");
		
		circuloVermelho.desenhar(1, 2, 3);
		circuloAzul.desenhar(10, 20, 5);
		circuloVerde.desenhar(30, 40, 50);
		
		//Compartilhou a cor vermelha
		circuloVermelho.desenhar(3, 3, 5);
	}
}
