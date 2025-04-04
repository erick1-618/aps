package aps.template_method.algorithms;

import aps.template_method.algorithms.template.RealizarCompraTemplate;

/**
 * Classe concreta do template. Define seus próprios passos para realizar o algoritmo, sem mudar a estrutura dele
 */

public class RealizarCompraOnline extends RealizarCompraTemplate {

	@Override
	public void escolherProduto() {
		System.out.println("Escolhendo um produto do catálogo do site..");
	}

	@Override
	public void prepararPagamento() {
		System.out.println("Fechando o carrinho com os itens");
	}

	@Override
	public void pagar() {
		System.out.println("Aplicando cupom, escolhendo método e realizando pagamento online");
	}
}
