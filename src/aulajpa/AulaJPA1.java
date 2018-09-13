package aulajpa;

import dominio.Pessoa;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author Josias Wattrelos
 */
public class AulaJPA1 {

    public static void main(String[] args) {
        
        Pessoa p1 = new Pessoa(null, "Silva", "carlos@gmail.com");
        Pessoa p2 = new Pessoa(null, "Torres", "joaquim@gmail.com");
        Pessoa p3 = new Pessoa(null, "Maria", "ana@gmail.com");
        
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("AulaJPAPU");
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        
        em.persist(p1);
        em.persist(p2);
        em.persist(p3);
        
        em.getTransaction().commit();
        System.out.println("Pronto");
    }
    
}
