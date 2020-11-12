package ru.job4j.oop;

public class Max {
    public static int max2(int a, int b) {
        boolean yes = a >= b;
        return yes ?  a : b;
    }

    public static int max3(int a, int b, int c) {
        int rsl = max2(b, c);
        return max2(a, rsl);
    }

    public static int max4(int a, int b, int c, int d) {
        int rsl = max3(b, c, d);
        return max2(a, rsl);
    }
}
