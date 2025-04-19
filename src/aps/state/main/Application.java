package aps.state.main;

import aps.state.context.CentralPedidos;

public class Application {
	public static void main(String[] args) {
		CentralPedidos c = new CentralPedidos();

		// --------- CAMINHO FELIZ

		// Aguardo -> em preparo
		c.proximaEtapa();

		// Em preparo -> pronto para entrega
		c.proximaEtapa();

		// Pronto para entrega -> saiu para entrega
		c.proximaEtapa();

		// Saiu para entrega -> entregue
		c.proximaEtapa();

		// Entregue -> estado final
		c.proximaEtapa();

		System.out.println("\n\n");
		c.newPedido();

		// ---------- CAMINHO DE PEDIDO CANCELADO

		// Aguardo -> em preparo
		c.proximaEtapa();

		// Em preparo -> pronto para entrega
		c.proximaEtapa();
		
		//Pronto para entrega -> em preparo
		c.erroEtapa();
		
		//Em preparo -> cancelado
		c.cancelarPedido();
		
		//Cancelado -> estado final
		c.erroEtapa();
	}
}
