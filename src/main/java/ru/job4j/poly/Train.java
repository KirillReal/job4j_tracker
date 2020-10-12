package ru.job4j.poly;

public class Train implements Vehicle{
    @Override
    public void move() {
        System.out.println(getClass().getSimpleName() + " Rides on rails");
    }

    @Override
    public int speed(int speedVehicle) {
        System.out.println(speedVehicle);
        return speedVehicle;
    }
}
