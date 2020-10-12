package ru.job4j.poly;

public class Plane implements Vehicle {
    @Override
    public void move(){
        System.out.println(getClass().getSimpleName() + " Fly");
    }

    @Override
    public int speed(int speedVehicle) {
        System.out.println(speedVehicle);
        return speedVehicle;
    }
}
