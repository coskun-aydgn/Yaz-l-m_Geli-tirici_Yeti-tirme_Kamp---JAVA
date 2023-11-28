package oopWithNLayeredApp.dataAccess;

import oopWithNLayeredApp.entities.Product;

public class HibernateProductDao implements ProductDao{
    public  void add(Product product) {
        //sadece ve sadece DB(database) erisim kodlari buraya yazilir...SQL
        System.out.println("Hibernate ile veri tabanina eklendi.");
    }
}
