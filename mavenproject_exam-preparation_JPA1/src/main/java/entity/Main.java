package entity;

import facade.Facade;

public class Main {
    
    public static void main(String[] args) {
        
        Facade facade = new Facade();
        
        // part 3 methods via facade
        facade.createCustomer("Frederik Fedderlein", "mail@mail.dk");
        
        System.out.println(facade.findCustomerByEmail("mail@mail.dk"));
        
        
        
        
        
        
    }

}
