package br.com.cursopcv.modelo.testes;
import br.com.cursopcv.modelo.*;

public class AlteracaoDeProduto {
	
	 public static void main(String[] args) {
		 Encapsulamento repositorio = new Encapsulamento();
		 Produto produto = repositorio.acharProdutoCod(2L);
		 
		 if (produto != null) {
			 produto.setPreco(345.00);
			 repositorio.transacaoCommit();
			 System.out.println("O preço foi alterado com sucesso.");
		 }
		 else {
			 System.out.println("O produto não foi encontrado. Tente novamente");
		 }
		 
		 repositorio.closeEntityManager();
	    }
	}
