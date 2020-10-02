package ru.job4j.sort;
import java.util.Arrays;

public class Machine {
    private final int[] COINS = {10, 5, 2, 1};
    public int[] change(int money, int price) {
        int[] rsl = new int[100];
        int remainder = money - price;
        int size = 0;
        int index = 0;
        for(int coin : COINS){
            while (remainder - coin >= 0){
                remainder -= coin;
                rsl[index] = coin;
                index++;
                size++;
            }
        }
        return Arrays.copyOf(rsl, size);
    }
}
