package br.com.cursopcv.modelo.testes;
import br.com.cursopcv.modelo.*;



public class InclusaoDeProduto {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub


		 Encapsulamento repositorio = new Encapsulamento();
	        
	        Produto prop1 = new Produto("teste", "teste",0);
	        prop1.setNome("Panela");
	        prop1.setDescricao("Panela de Pressão 10 Litros");
	        prop1.setPreco(56.80);

	       Produto prop2 = new Produto("teste", "teste",0);
	        prop2.setNome("Cama");
	        prop2.setDescricao("Cama de casal Big");
	        prop2.setPreco(450.68);

	        Produto prop3 = new Produto("teste", "teste",0);
	        prop3.setNome("Caixa Som");
	        prop3.setDescricao("Caixa de Som JBL");
	        prop3.setPreco(160.00);
	        
	        
	        repositorio.incluir(prop1);
	        repositorio.incluir(prop2);
	        repositorio.incluir(prop3);
	        
	        repositorio.closeEntityManager();

	}

}
