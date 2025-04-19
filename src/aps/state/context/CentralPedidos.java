package aps.state.context;

import aps.state.states.AguardandoConfirmacao;
import aps.state.states.StatePedido;

public class CentralPedidos {

	private StatePedido estado;
	
	public CentralPedidos() {
		newPedido();
	}
	
	public void newPedido() {
		System.out.println("Criando novo pedido");
		this.estado = new AguardandoConfirmacao(this);
	}

	public void setState(StatePedido s) {
		this.estado = s;
	}
	
	public void proximaEtapa() {
		this.estado.proximaEtapa();
	}
	
	public void erroEtapa() {
		this.estado.erroEtapa();
	}
	
	public void cancelarPedido() {
		this.estado.cancelarPedido();
	}
}
