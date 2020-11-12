package ru.job4j.sort;
import java.util.Arrays;

public class Machine {
    private final int[] coins = {10, 5, 2, 1};

    public int[] change(int money, int price) {
        int[] rsl = new int[100];
        int remainder = money - price;
        int size = 0;
        int i = 0;
        for (int coin : coins) {
            while (remainder - coin >= 0) {
                remainder -= coin;
                rsl[i] = coin;
                i++;
                size++;
            }
        }
        return Arrays.copyOf(rsl, size);
    }
}
