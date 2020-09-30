package ru.job4j.oop;

public class BallStory {
    public static void main(String[] args) {
        Ball Kolobock = new Ball();
        Hare hare = new Hare();
        Fox fox = new Fox();
        Wolf2 wolf = new Wolf2();
        Kolobock.roll();
        hare.tryEat(Kolobock);
        wolf.tryEat(Kolobock);
        fox.tryEat(Kolobock);
    }
}
