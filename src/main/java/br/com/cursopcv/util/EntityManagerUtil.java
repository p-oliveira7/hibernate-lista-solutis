package br.com.cursopcv.util;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/*
    Classe EntityManagerUtil é responsável por criar e fornecer instâncias de
    EntityManager para outras partes do seu código.
    Ela também fecha a fábrica de EntityManager quando necessário.
 */
public class EntityManagerUtil {

    private static final String PERSISTENCE_UNIT_NAME = "controleestoque";
    private static final EntityManagerFactory entityManagerFactory;

    static {
        try {
            entityManagerFactory = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
        } catch (Throwable ex) {
            throw new ExceptionInInitializerError(ex);
        }
    }

    public static EntityManager getEntityManager() {
        return entityManagerFactory.createEntityManager();
    }

    public static void closeEntityManagerFactory() { // quando não precisar mais interagir com o banco de dados.
        if (entityManagerFactory != null) {
            entityManagerFactory.close();
        }
    }
}
