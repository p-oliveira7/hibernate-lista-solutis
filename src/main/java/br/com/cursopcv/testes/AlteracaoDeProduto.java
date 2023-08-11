package br.com.cursopcv.testes;

import br.com.cursopcv.servico.ProdutoService;

public class AlteracaoDeProduto {

	public static void main(String[] args) {
		try (ProdutoService produtoService = new ProdutoService()) {
			produtoService.alterarPrecoProduto(2L, 345.00);
			System.out.println("O preço foi alterado com sucesso.");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
