package main;



import facade.Facade;

public class Main {
    
    public static void main(String[] args) {
        
        Facade facade = new Facade();
        
        // part 3 methods via facade
        
        // INSERT INTO
        facade.createCustomer("Frederik Fedderlein", "mail@mail.dk");
        facade.createItemType("Ketchers", "The best for a fly guy", 500.50);
        
        // SELECT        
        System.out.println(facade.findCustomerByEmail("mail@mail.dk").get(0).getName());
        
        
        facade.close();
        
        
        
    }

}
