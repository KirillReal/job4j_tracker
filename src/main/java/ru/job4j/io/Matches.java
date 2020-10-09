package ru.job4j.io;

import java.util.Scanner;
public class Matches {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numbermatch = 11;
        int player = 0;
        while (numbermatch > 0) {
            System.out.println("Количество спичек на столе: " + numbermatch);
            System.out.print("Выберите количество спичек от 1 до 3: \n");
            int select = Integer.valueOf(input.nextLine());
            if (select <= 3 && select > 0) {
                player++;
                numbermatch -= select;
                System.out.println();
            } else {
                System.out.println("Можно брать от 1 до 3 спичек!");
            }
        }
            if (player % 2 == 0) {
                System.out.println("Победил первый игрок");
            } else {
                System.out.println("Победил второй игрок");
            }
    }
}

