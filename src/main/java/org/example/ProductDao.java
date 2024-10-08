package org.example;

public class ProductDao {

    public ProductDao() {}

    public Product findById(int id) {

        return new Product(1, "Product A", 10);
    }
}
