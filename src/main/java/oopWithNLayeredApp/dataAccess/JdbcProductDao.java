package oopWithNLayeredApp.dataAccess;

import oopWithNLayeredApp.entities.Product;

public class JdbcProductDao implements ProductDao{
    public void add(Product produckt){
        //sadece ve sadece DB(database) erisim kodlari buraya yazilir...SQL
        System.out.println("JDBC ile veri tabanina eklendi.");
    }

}
