package br.com.cursopcv.modelo.testes;
import br.com.cursopcv.modelo.*;



public class RemocaoDeProduto {
	public static void main(String[] args) {
		Encapsulamento repositorio = new Encapsulamento();
		
		Produto produto = repositorio.acharProdutoCod(3L);
		
		if (produto != null) {
			repositorio.remove(produto);
			
			 System.out.println("O produto foi removido.");
			 }
			 else {
				 System.out.println("O produto não foi encontrado. Tente novamente");

    }
		
		repositorio.closeEntityManager();

}
}
