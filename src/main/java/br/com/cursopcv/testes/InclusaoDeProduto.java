package br.com.cursopcv.testes;
import br.com.cursopcv.servico.ProdutoService;

public class InclusaoDeProduto {


	public static void main(String[] args) {
		try (ProdutoService produtoService = new ProdutoService()) {
			produtoService.incluirNovoProduto("Panela", "Panela de Pressão 10 Litros", 56.80);
			produtoService.incluirNovoProduto("Cama", "Cama de casal Big", 450.68);
			produtoService.incluirNovoProduto("Caixa Som", "Caixa de Som JBL", 160.00);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
