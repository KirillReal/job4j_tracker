package ru.job4j.pojo;

import static org.junit.Assert.assertThat;
import static org.hamcrest.Matchers.is;

import org.junit.Test;

public class ShopTest {
    @Test
    public void whenLastNull() {
        Product products[] = new Product[5];
        products[0] = new Product("Milk", 10);
        products[1] = new Product("Bread", 4);
        products[2] = new Product("Egg", 19);
        int rsl = Shop.indexOfNull(products);
        assertThat(rsl, is(3));
    }

    @Test
    public void whenFirstNull() {
        Product products[] = new Product[5];
        products[1] = new Product("Milk", 10);
        int rsl = Shop.indexOfNull(products);
        assertThat(rsl, is(0));
    }

    @Test
    public void whenHasNotNull() {
        Product products[] = new Product[1];
        products[0] = new Product("Milk", 10);
        int rsl = Shop.indexOfNull(products);
        assertThat(rsl, is(-1));
    }
    @Test
    public void whenAllNotNull() {
        Product products[] = new Product[4];
        products[0] = new Product("Milk", 10);
        products[1] = new Product("Bread",20);
        products[2] = new Product("Chocolate", 30);
        products[3] = new Product("Tea",10);
        int rsl = Shop.indexOfNull(products);
        assertThat(rsl, is(-1));
    }
    @Test
    public void whenTwoNotNull() {
        Product products[] = new Product[4];
        products[1] = new Product("Bread",20);
        products[2] = new Product("Chocolate", 30);
        int rsl = Shop.indexOfNull(products);
        assertThat(rsl, is(0));
    }
}