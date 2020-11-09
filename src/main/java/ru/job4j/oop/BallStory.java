package ru.job4j.oop;

public class BallStory {
    public static void main(String[] args) {
        Ball Rollback = new Ball();
        Hare hare = new Hare();
        Fox fox = new Fox();
        Wolf2 wolf = new Wolf2();
        Rollback.roll();
        hare.tryEat(Rollback);
        wolf.tryEat(Rollback);
        fox.tryEat(Rollback);
    }
}
