package br.com.cursopcv.modelo.testes;
import br.com.cursopcv.servico.ProdutoService;

public class RemocaoDeProduto {
	public static void main(String[] args) {

		try (ProdutoService produtoService = new ProdutoService()) {
			produtoService.removerProdutoPorCodigo(3L);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
