package aps.state.states;

import aps.state.context.CentralPedidos;

/**
 * Classe que representa um pedido entregue
 */
public class Entregue implements StatePedido{
	CentralPedidos central;

	public Entregue(CentralPedidos c) {
		this.central = c;
	}

	/**
	 * Simula a efetivação da entrega, concluindo o ciclo de estados do pedido
	 */
	@Override
	public void proximaEtapa() {
		System.out.println("O cliente recebeu o pedido!");
	}

	/**
	 * Simula um erro na efetiva entrega do pedido
	 */
	@Override
	public void erroEtapa() {
		System.out.println("O cliente não atendeu o motoboy...");
		this.central.setState(new SaiuEntrega(central));
	}
	
	@Override
	public void cancelarPedido() {
		System.out.println("Pedido já entregue não pode ser cancelado");
	}
}
