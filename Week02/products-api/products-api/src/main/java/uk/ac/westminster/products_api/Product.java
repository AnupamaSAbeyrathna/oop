package uk.ac.westminster.products_api;

public class Product {
    private Long id;
    private String name;
    private double price;

    public Product() {}

    public Product(Long id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public Long getId() {return id;}
    public void setId(Long id) {this.id = id;}

    public String getName() {return name;}
    public void setName(String name) {this.name = name;}
    //Jackson skips the name field because it can only serialize fields that have a matching public getter, and without a getName() method there’s nothing for it to call, so the field is silently ignored.
    //You would notice because the JSON output would be missing several fields even though your code compiled normally, giving you no error message to warn you.

    public double getPrice() {return price;}
    public void setPrice(double price) {this.price = price;}
}
