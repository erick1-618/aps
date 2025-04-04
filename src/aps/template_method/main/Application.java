package aps.template_method.main;

import aps.template_method.algorithms.RealizarCompraOnline;
import aps.template_method.algorithms.RealizarCompraPresencial;
import aps.template_method.algorithms.template.RealizarCompraTemplate;

public class Application {
	public static void main(String[] args) {
		RealizarCompraTemplate compra = new RealizarCompraPresencial();
		
		//Exemplo de utilização, trocando de implementações do algoritmo
		
		System.out.println("-----Via presencial-----");
		
		compra.realizarCompra();
		
		compra = new RealizarCompraOnline();
		
		System.out.println("-----Via online-----");

		
		compra.realizarCompra();
	}
}
