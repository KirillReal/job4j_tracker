package ru.job4j.poly;

public class Bus1 implements Vehicle {
    @Override
    public void move() {
        System.out.println(getClass().getSimpleName() + " Driving on the road");
    }

    @Override
    public int speed(int speedVehicle) {
        System.out.println(speedVehicle);
        return speedVehicle;
    }
}
