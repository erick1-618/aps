package aps.state.states;

import aps.state.context.CentralPedidos;

/**
 * Representa um estado onde o pedido é cancelado
 */
public class Cancelado implements StatePedido{

	private CentralPedidos central;
	
	public Cancelado(CentralPedidos c) {
		this.central = c;
	}
	
	/**
	 * Simula um estado onde o cliente resolve realizar outro pedido, reiniciando o ciclo
	 */
	@Override
	public void proximaEtapa() {
		System.out.println("O cliente resolveu fazer outro pedido");
		this.central.setState(new AguardandoConfirmacao(central));
	}

	/**
	 * Simula o efetivo cancelamento do pedido, sendo um estado terminal do ciclo do pedido
	 */
	@Override
	public void erroEtapa() {
		System.out.println("Cliente desistiu de fazer outro pedido");
	}

	@Override
	public void cancelarPedido() {
		System.out.println("Pedido já cancelado");
	}
}
