package model;

public class Product {
    private String SKU;
    private double price;
    private int popularity;

    public Product(String SKU, double price, int popularity) {
        this.SKU = SKU;
        this.price = price;
        this.popularity = popularity;
    }

    public String getSKU() { return SKU; }
    public double getPrice() { return price; }
    public int getPopularity() { return popularity; }

    @Override
    public String toString() {
        return SKU + " - " + price + " (" + popularity + ")";
    }
}