package aps.state.states;

/**
 * Interface padrão que define o comportamento que os estados deverão implementar
 */

public interface StatePedido {
	/**
	 * Representa a finalização de uma etapa com êxito 
	 */
	public void proximaEtapa();
	
	/**
	 * Representa a não conclusão de uma etapa
	 */
	public void erroEtapa();
	
	
	/**
	 * Representa o cancelamento de um pedido
	 */
	public void cancelarPedido();
}
