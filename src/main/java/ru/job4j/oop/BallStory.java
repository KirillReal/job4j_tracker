package ru.job4j.oop;

public class BallStory {
    public static void main(String[] args) {
        Ball rollback = new Ball();
        Hare hare = new Hare();
        Fox fox = new Fox();
        Wolf2 wolf = new Wolf2();
        rollback.roll();
        hare.tryEat(rollback);
        wolf.tryEat(rollback);
        fox.tryEat(rollback);
    }
}
