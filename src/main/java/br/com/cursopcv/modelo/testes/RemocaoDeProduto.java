package br.com.cursopcv.modelo.testes;
import br.com.cursopcv.modelo.*;

public class RemocaoDeProduto {
	public static void main(String[] args) {
		Encapsulamento repositorio = new Encapsulamento();

		try {
			repositorio.iniciarTransacao(); // Iniciar a transação

			Produto produto = repositorio.acharProdutoCod(5L);

			if (produto != null) {
				repositorio.remove(produto);
				System.out.println("O produto foi removido com sucesso.");
			} else {
				System.out.println("O produto não foi encontrado. Tente novamente");
			}
		} catch (Exception e) {
			repositorio.reverterTransacao(); // Reverter a transação em caso de erro
			e.printStackTrace();
		} finally {
			repositorio.closeEntityManager();
		}
	}
}