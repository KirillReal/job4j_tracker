package ru.job4j.pojo;

public class Shop {
    public static int indexOfNull(Product[] products) {
        int i;
        int rsl = -1;
        for(i = 0; i < products.length;i++){
            Product product = products[i];
            if(product == null){
                rsl = i;
                break;
            }
        }
        return rsl;
    }
}
