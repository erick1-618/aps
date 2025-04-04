package aps.template_method.algorithms;

import aps.template_method.algorithms.template.RealizarCompraTemplate;

/**
 * Classe concreta do template. Define seus próprios passos para realizar o algoritmo, sem mudar a estrutura dele
*/

public class RealizarCompraPresencial extends RealizarCompraTemplate {

	@Override
	public void escolherProduto() {
		System.out.println("Escolhendo um produto da prateleira..");
	}

	@Override
	public void prepararPagamento() {
		System.out.println("Indo até o caixa");
	}

	@Override
	public void pagar() {
		System.out.println("Realizando o pagamento ao caixa, pelo método escolhido");
	}
}
