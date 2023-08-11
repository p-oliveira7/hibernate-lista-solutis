package br.com.cursopcv.modelo;

import javax.persistence.*;

public class Encapsulamento {
    EntityManagerFactory emf;
    EntityManager em;


public Encapsulamento(){
    emf = Persistence.createEntityManagerFactory("controleestoque");
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
    em.getTransaction().begin();
    em.remove(produto);
    em.getTransaction().commit();
}

public void closeEntityManager() {
    em.close();
}

public void transacaoCommit() {
    em.getTransaction().commit();
}
}
