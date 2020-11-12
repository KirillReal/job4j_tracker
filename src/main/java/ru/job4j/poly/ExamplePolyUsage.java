package ru.job4j.poly;

public class ExamplePolyUsage {
    public static void main(String[] args) {
        Vehicle plane = new Plane();
        Vehicle train = new Train();
        Vehicle bus = new Bus1();

        Vehicle[] vehicles = new Vehicle[]{plane, train, bus};
        for (Vehicle v : vehicles) {
            v.move();
        }
    }
}
