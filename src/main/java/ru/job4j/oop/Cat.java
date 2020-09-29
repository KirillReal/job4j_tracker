package ru.job4j.oop;

public class Cat {
    private String food;
    private String name;
    public void show(){
        System.out.println(this.name);
        System.out.println(this.food);
    }
    public void eat(String meat){
        this.food = meat;
    }
    public void name(String nick){
        this.name = nick;
    }
    public static void main(String[] args) {
        System.out.println("There are gav's name and food:");
        Cat gav = new Cat();
        gav.name("Vasya");
        gav.eat("kotleta");
        gav.show();
        System.out.println("There are black's name and food");
        Cat black = new Cat();
        black.name("Felix");
        black.eat("fish");
        black.show();
    }
}
