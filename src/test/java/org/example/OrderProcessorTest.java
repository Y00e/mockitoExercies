package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class OrderProcessorTest {

    @Test
    void calculatePrice() {
        // given
        ProductDao productDao = mock(ProductDao.class);
        Product product = new Product(1, "Product A", 10);
        Product product2 = new Product(2, "Product B", 12);
        when(productDao.findById(1)).thenReturn(product);
        when(productDao.findById(2)).thenReturn(product2);
        OrderProcessor orderProcessor = new OrderProcessor(productDao);

        // when
        int price = orderProcessor.calculatePrice(1, 2);
        //int price2 = orderProcessor.calculatePrice(2);

        // then
        assertEquals(22, price);

    }
}