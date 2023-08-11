package br.com.cursopcv.modelo;

import javax.persistence.*;
import java.util.List;

public class Encapsulamento {
    EntityManagerFactory emf;
    EntityManager em;


    public Encapsulamento(){
        emf = Persistence.createEntityManagerFactory("jpa_exemplo");
        em = emf.createEntityManager();
    }

    public void incluir(Produto produto){
        em.getTransaction().begin();
        em.merge(produto);
        em.getTransaction().commit();

    }

    public Produto acharProdutoCod(Long cod) {
        return em.find(Produto.class, cod);
    }

    public void remove(Produto produto) {
        em.remove(produto);
        em.getTransaction().commit();
    }
    public void reverterTransacao() {
        if (em.getTransaction().isActive()) {
            em.getTransaction().rollback();
        }
    }
    public void iniciarTransacao() {
        em.getTransaction().begin();
    }

    public void closeEntityManager() {
        em.close();
    }

    public void transacaoCommit() {
        em.getTransaction().commit();
    }

    public List<Produto> listarTodosProdutos() {
        TypedQuery<Produto> query = em.createQuery("SELECT p FROM produto p", Produto.class);
        return query.getResultList();
    }
}