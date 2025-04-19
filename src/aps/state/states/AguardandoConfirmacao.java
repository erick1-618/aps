package aps.state.states;

import aps.state.context.CentralPedidos;

/**
 * Representa o estado em que o pedido aguarda confirmação
 */

public class AguardandoConfirmacao implements StatePedido{

	private CentralPedidos central;
	
	public AguardandoConfirmacao(CentralPedidos central) {
		this.central = central;
	}

	/**
	 * Realiza a confirmação do pedido e o leva ao estado de "Em preparo" 
	 */
	@Override
	public void proximaEtapa() {
		System.out.println("Pedido confirmado!");
		this.central.setState(new EmPreparo(central));
	}

	/**
	 * Simula um erro na confirmação do pedido
	 */
	@Override
	public void erroEtapa() {
		System.out.println("Erro na confirmação, cancelando pedido");
		this.central.setState(new Cancelado(central));
	}

	@Override
	public void cancelarPedido() {
		System.out.println("Cancelando o pedido");
		this.central.setState(new Cancelado(central));
	}

}
