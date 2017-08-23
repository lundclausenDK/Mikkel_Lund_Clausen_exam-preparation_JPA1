package facade;

import entity.Customer;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class Facade {
    
    public void createCustomer(String name, String email) {
        
        Customer c = new Customer();
        
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("jpaPU");
        EntityManager em = emf.createEntityManager();

        em.getTransaction().begin();
        
        c.setName(name);
        c.setEmail(email);
        
        em.persist(c);
        em.getTransaction().commit();
        em.close();
        
    }
    
    public Object findCustomerByEmail(String email) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("jpaPU");
        EntityManager em = emf.createEntityManager();
        
        em.getTransaction().begin();
        
        Query q = em.createQuery("SELECT NAME FROM CUSTOMER WHERE EMAIL = '" + email + "'");
        
        Object result = q.getSingleResult();
        
        em.close();
        
        return result;
    }
    
    

}
