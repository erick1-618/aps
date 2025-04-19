package aps.state.states;

import aps.state.context.CentralPedidos;

/**
 * Represnta o estado de preparo do pedido
 */
public class EmPreparo implements StatePedido{

	private CentralPedidos central;
	
	public EmPreparo(CentralPedidos central) {
		this.central = central;
	}
	
	/**
	 * Leva o estado do pedido até "pronto para entrega"
	 */
	@Override
	public void proximaEtapa() {
		System.out.println("Pedido pronto!");
		this.central.setState(new ProntoEntrega(central));
	}
	
	/**
	 * Simula um erro de preparo do pedido
	 */
	@Override
	public void erroEtapa() {
		System.out.println("Foi preparado o item errado do cardápio...");
		this.central.setState(new AguardandoConfirmacao(central));
	}
	
	@Override
	public void cancelarPedido() {
		System.out.println("Cancelando o pedido");
		this.central.setState(new Cancelado(central));
	}
}
