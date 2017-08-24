package facade;

import entity.Customer;
import entity.ItemType;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Facade {
    
    private EntityManagerFactory emf = Persistence.createEntityManagerFactory("jpaPU");
    private EntityManager em = emf.createEntityManager();
    
    
    public void createCustomer(String name, String email) {
        
        Customer c = new Customer();

        em.getTransaction().begin();
        
        c.setName(name);
        c.setEmail(email);
        
        em.persist(c);
        em.getTransaction().commit();
        //em.close();
        
    }
    
    public void createItemType(String name, String Description, double price) {
        
        ItemType it = new ItemType();
        
        em.getTransaction().begin();
        
        it.setName(name);
        it.setDescription(Description);
        it.setPrice(price);
        
        em.persist(it);
        em.getTransaction().commit();
        //em.close();
        
    }
    
    public List<Customer> findCustomerByEmail(String email) {
        
        em.getTransaction().begin();
        
        List<Customer> results = em.createNamedQuery("findCostumerByEmail").setParameter("email", email).getResultList();
                
        //em.close();
        
        return results;
    }
    
    public void close() {
        em.close();
    }
    
    

}
