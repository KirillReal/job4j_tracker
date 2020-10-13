package ru.job4j.tracker;

import ru.job4j.poly.Transport;

import java.sql.SQLOutput;

public class StartUI1 {
    public static void createItem(Input input, Tracker tracker) {
        System.out.println("=== Create a new Item ====");
        String name = input.askStr("Enter name: ");
        Item item = new Item(name);
        tracker.add(item);
    }

    public static void replaceItem(Input input, Tracker tracker) {
        int inputUser = Integer.valueOf(input.askStr("Enter id selected item:"));
        System.out.println();
        String name = input.askStr("Enter new name:");
        Item item = new Item(name);
        if (tracker.replace(inputUser, item)) {
            System.out.println("Replacement of the application completed");
        } else {
            System.out.println("Id is not found");
        }
    }
    public static void deleteItem(Input input, Tracker tracker){
        int id = Integer.valueOf(input.askStr("Enter the id you want to delete:"));
        if (tracker.delete(id)) {
            System.out.println("Order deletion completed");
        } else {
            System.out.println("Error");
        }
    }
    public void init(Input input, Tracker tracker) {
        boolean run = true;
        while (run) {
            this.showMenu();
            int select = input.askInt("Select: ");
            if (select == 0) {
                StartUI1.createItem(input, tracker);
            } else if (select == 1) {
                Item[] showAll = tracker.findAll();
                for (int index = 0; index < showAll.length; index++) {
                    System.out.println(showAll[index].toString());
                }
            } else if (select == 2) {
                StartUI1.replaceItem(input, tracker);
            } else if (select == 3) {
                StartUI1.deleteItem(input, tracker);
            } else if (select == 4) {
                String msg = "Enter the id you want to find:";
                int id = Integer.valueOf(input.askStr(msg));
                Item obj = tracker.findById(id);
                if (obj != null) {
                    System.out.println(obj);
                } else {
                    System.out.println("Id is not found");
                }
            } else if (select == 5) {
                System.out.println("=== Find items by name ===");
                String msg = "Enter name: ";
                Item[] obj = tracker.findByName(input.askStr(msg));
                if (obj.length != 0) {
                    for (int i = 0; i < obj.length; i++)
                        System.out.println(obj[i].toString());
                } else {
                    System.out.println("Array is empty");
                }
            } else if (select == 6) {
                run = false;
            } else {
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
        Input input = new ConsoleInput();
        Tracker tracker = new Tracker();
        new StartUI().init(input, tracker);
    }
}

