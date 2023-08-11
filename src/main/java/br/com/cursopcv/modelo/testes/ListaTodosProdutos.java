package br.com.cursopcv.modelo.testes;

import br.com.cursopcv.modelo.Encapsulamento;
import br.com.cursopcv.modelo.Produto;

import java.util.List;

public class ListaTodosProdutos {

    public static void main(String[] args) {
        Encapsulamento repositorio = new Encapsulamento();

        try {
            List<Produto> produtos = repositorio.listarTodosProdutos();

            if (!produtos.isEmpty()) {
                System.out.println("Lista de Produtos:");
                for (Produto produto : produtos) {
                    System.out.println("Código: " + produto.getCod() + ", Nome: " + produto.getNome() + ", Preço: " + produto.getPreco());
                }
            } else {
                System.out.println("Nenhum produto cadastrado.");
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            repositorio.closeEntityManager();
        }
    }
}