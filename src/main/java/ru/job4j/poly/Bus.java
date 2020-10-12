package ru.job4j.poly;

public class Bus implements Transport {
    @Override
    public void ride() {
    }

    @Override
    public int passengers(int numPassenger) {
        return numPassenger;
    }

    @Override
    public double fillUp(int Price) {
        return Price;
    }
}
