package oopWithNLayeredApp.entities;

public class Product {
    private int id;
    private String name;
    private double pris;

    public Product() {

    }

    public Product(int id, String name, double pris) {
        this.id = id;
        this.name = name;
        this.pris = pris;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getPris() {
        return pris;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPris(double pris) {
        this.pris = pris;
    }
}
