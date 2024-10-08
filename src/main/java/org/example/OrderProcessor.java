package org.example;

public class OrderProcessor {

    private ProductDao productDao;

    public OrderProcessor(ProductDao productDao) {
        this.productDao = productDao;
    }


    public int calculatePrice(int x, int y) {
        int sum = 0;
        Product product = productDao.findById(x);
        Product product2 = productDao.findById(y);

        sum = product.getPrice() + product2.getPrice();
        return sum;
    }
}
