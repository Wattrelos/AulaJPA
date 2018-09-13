package aulajpa;

import dominio.Cadastro;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author Josias Wattrelos
 */
public class AulaJPA {

    public static void main(String[] args) {
        
        Cadastro p1 = new Cadastro(null, "Leticia Cardoso Souza",12345678901L,58,216);       
        
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("AulaJPAPU");
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        
        em.persist(p1);        
        
        em.getTransaction().commit();
        System.out.println("Pronto");
    }
    
}
