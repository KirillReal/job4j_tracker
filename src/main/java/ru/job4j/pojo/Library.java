package ru.job4j.pojo;

public class Library {
    public static void main(String[] args) {
        Book bookA = new Book("Doomed city", 750);
        Book bookB = new Book("Java: The Complete Reference", 1500);
        Book bookC = new Book("Clean code", 1200);
        Book bookD = new Book("Kotlin In-Depth", 900);
        Book[] library = new Book[4];
        library[0] = bookA;
        library[1] = bookB;
        library[2] = bookC;
        library[3] = bookD;
        for (int index = 0; index < library.length; index++) {
            Book lb = library[index];
            System.out.println(lb.getName() + "-" + lb.getNumberOfPages());
        }
        library[0] = bookD;
        library[3] = bookA;
        for (int index = 0; index < library.length; index++) {
            Book lb = library[index];
            System.out.println(lb.getName() + "-" + lb.getNumberOfPages());
        }
        System.out.println("Books titled Clean Code");
        for (int index = 0; index < library.length; index++) {
            if (library[index].getName().equals("Clean code")) {
                Book lb = library[index];
                System.out.println(lb.getName() + "-" + lb.getNumberOfPages());
            }
        }
    }
}
