package aps.state.states;

import aps.state.context.CentralPedidos;

/**
 * Simula o estado em que o pedido saiu para entrega no destino
 */
public class SaiuEntrega implements StatePedido{
	
	CentralPedidos central;
	
	public SaiuEntrega(CentralPedidos c) {
		this.central = c;
	}

	/**
	 * Simula a entrega do pedido
	 */
	@Override
	public void proximaEtapa() {
		System.out.println("O pedido foi entregue!");
		this.central.setState(new Entregue(central));
	}

	/**
	 * Simula um erro na entrega do pedido
	 */
	@Override
	public void erroEtapa() {
		System.out.println("O motorista não achou o endereço...");
		this.central.setState(new ProntoEntrega(central));
	}

	@Override
	public void cancelarPedido() {
		System.out.println("Cancelando o pedido");
		this.central.setState(new Cancelado(central));
	}
}
