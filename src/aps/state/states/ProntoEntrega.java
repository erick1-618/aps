package aps.state.states;

import aps.state.context.CentralPedidos;

/**
 * Representa o estado em que o pedido está pronto para ser entregue
 */
public class ProntoEntrega implements StatePedido {

	private CentralPedidos central;

	public ProntoEntrega(CentralPedidos central) {
		this.central = central;
	}

	/**
	 * Leva o pedido ao estado de "saiu para entrega"
	 */
	@Override
	public void proximaEtapa() {
		System.out.println("Pedido saiu para entrega!");
		this.central.setState(new SaiuEntrega(central));
	}

	/**
	 * Simula um erro na logística do pedido
	 */
	@Override
	public void erroEtapa() {
		System.out.println("O pedido foi jogado no lixo por engano...");
		this.central.setState(new EmPreparo(central));
	}

	@Override
	public void cancelarPedido() {
		System.out.println("Cancelando o pedido");
		this.central.setState(new Cancelado(central));
	}
}
