package br.com.cursopcv.servico;

import br.com.cursopcv.dao.ProdutoDAO;
import br.com.cursopcv.modelo.Produto;
import br.com.cursopcv.util.EntityManagerUtil;

import javax.persistence.EntityManager;
import java.util.List;

public class ProdutoService implements AutoCloseable {

    private final EntityManager entityManager;
    private final ProdutoDAO produtoDAO;

    public ProdutoService() {
        entityManager = EntityManagerUtil.getEntityManager();
        produtoDAO = new ProdutoDAO(entityManager);
    }

    public Produto buscarProdutoPorCodigo(Long cod) {
        return produtoDAO.buscarPorCodigo(cod);
    }

    public List<Produto> listarTodosProdutos() {
        return produtoDAO.listarTodos();
    }

    public void incluirNovoProduto(String nome, String descricao, double preco) {
        Produto produto = new Produto(nome, descricao, preco);
        produtoDAO.salvar(produto);
    }

    public void removerProdutoPorCodigo(Long codigo) {
        try {
            Produto produto = buscarProdutoPorCodigo(codigo);

            if (produto != null) {
                produtoDAO.remover(produto);
                System.out.println("O produto foi removido com sucesso.");
            } else {
                System.out.println("O produto não foi encontrado. Tente novamente");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void alterarPrecoProduto(Long codigo, double novoPreco) {
        Produto produto = buscarProdutoPorCodigo(codigo);
        if (produto != null) {
            produto.setPreco(novoPreco);
            produtoDAO.atualizar(produto);
        } else {
            System.out.println("O produto não foi encontrado. Tente novamente");
        }
    }

    @Override
    public void close() {
        entityManager.close();
    }
}
