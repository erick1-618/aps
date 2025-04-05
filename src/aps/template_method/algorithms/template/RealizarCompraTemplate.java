package aps.template_method.algorithms.template;

/**
 * Define as classes e implementações padrão de executar um determinado algoritmo. Nesse caso, todos os steps devem ser reescritos, mas essa não é uma regra.
 */

public abstract class RealizarCompraTemplate {

	
	/**
	 * Esse é o elemento chave do Template Method, que define a estrutura do algoritmo, isto é, a ordem dos passos a serem seguidos, e isso não muda
	 */
	public final void realizarCompra(){
		escolherProduto();    
		prepararPagamento();
		pagar();
	}

	public abstract void escolherProduto();
	public abstract void prepararPagamento();
	public abstract void pagar();
}
