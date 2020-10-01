package ru.job4j.oop;

public class Max {
    public static int Max2(int a, int b){
        boolean yes = a >= b;
        int result = yes ?  a : b;
        return result;
    }
    public static int Max3(int a, int b, int c){
        int rsl = Max2(b,c);
        return Max2(a,rsl);
    }
    public static int Max4(int a, int b, int c, int d){
        int rsl = Max3(b,c,d);
        return Max2(a,rsl);
    }
}
