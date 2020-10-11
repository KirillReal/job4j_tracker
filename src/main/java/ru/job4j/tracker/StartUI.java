package ru.job4j.tracker;

import java.sql.SQLOutput;
import java.util.Scanner;

public class StartUI {
    public void init(Scanner scanner, Tracker tracker) {
        boolean run = true;
        while (run) {
            this.showMenu();
            System.out.print("Select:");
            int select = Integer.valueOf(scanner.nextLine());
            if(select >= 0 && select <= 6) {
                if (select == 0) {
                    System.out.println("=== Create a new Item ====");
                    System.out.print("Enter name: ");
                    String name = scanner.nextLine();
                    Item item = new Item(name);
                    tracker.add(item);
                } else if (select == 1) {
                    Item[] showAll = tracker.findAll();
                    System.out.println(showAll);
                } else if (select == 2) {
                    System.out.println("Enter id selected item:");
                    int input = Integer.valueOf(scanner.nextLine());
                    if (input != -1) {
                        System.out.println("Enter new name:");
                        String name = scanner.nextLine();
                        Item item = new Item(name);
                        tracker.replace(input, item);
                    } else {
                        System.out.println("Id is not found");
                    }
                } else if (select == 3) {
                    System.out.println("Enter the id you want to delete:");
                    int id = Integer.valueOf(scanner.nextLine());
                    if (tracker.delete(id)) {
                        tracker.delete(id);
                    } else {
                        System.out.println("Error");
                    }
                } else if (select == 4) {
                    System.out.println("Enter the id you want to find:");
                    int id = Integer.valueOf(scanner.nextLine());
                    Item obj = tracker.findById(id);
                    if (obj != null) {
                        System.out.println(obj);
                    } else {
                        System.out.println("Id is not found");
                    }
                } else if (select == 5) {
                    System.out.println("=== Find items by name ===");
                    System.out.print("Enter name: ");
                    Item[] obj = tracker.findByName(scanner.nextLine());
                    for (int i = 0; i < obj.length; i++)
                        System.out.println(obj[i].toString());
                } else if (select == 6) {
                    run = false;
                }
            }else {
                System.out.println("Wrong item selected!");
            }
        }
    }

    private void showMenu() {
        System.out.println("Menu.");
        System.out.println("1.Show all items");
        System.out.println("2.Edit item");
        System.out.println("3.Delete item");
        System.out.println("4.Find item by Id");
        System.out.println("5.Find items by name");
        System.out.println("6.Exit Program");
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Tracker tracker = new Tracker();
        new StartUI().init(scanner, tracker);
    }
}

