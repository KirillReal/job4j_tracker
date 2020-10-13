package ru.job4j.tracker;


import java.sql.SQLOutput;


public class StartUI {
    public void init(Input input, Tracker tracker) {
        boolean run = true;
        while (run) {
            this.showMenu();
            String mess = "Select:";
            int select = Integer.valueOf(input.askStr(mess));
            if(select >= 0 && select <= 6) {
                if (select == 0) {
                    System.out.println("=== Create a new Item ====");
                    String msg = "Enter a name:";
                    String name = input.askStr(msg);
                    Item item = new Item(name);
                    tracker.add(item);
                } else if (select == 1) {
                    Item[] showAll = tracker.findAll();
                    for(int index = 0; index < showAll.length; index++) {
                        System.out.println(showAll[index].toString());
                    }
                } else if (select == 2) {
                    String msg = "Enter id selected item:";
                    int inputUser = Integer.valueOf(input.askStr(msg));
                        System.out.println("Enter new name:");
                        String name = input.askStr(msg);
                        Item item = new Item(name);
                    if (tracker.replace(inputUser, item)) {
                        System.out.println("Replacement of the application completed");;
                    } else {
                        System.out.println("Id is not found");
                    }
                } else if (select == 3) {
                    String msg = "Enter the id you want to delete:";
                    int id = Integer.valueOf(input.askStr(msg));
                    if (tracker.delete(id)) {
                        System.out.println("Order deletion completed");
                    } else {
                        System.out.println("Error");
                    }
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
                    if(obj.length != 0){
                    for (int i = 0; i < obj.length; i++)
                        System.out.println(obj[i].toString());
                    }else{
                        System.out.println("Array is empty");
                    }
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
        Input input = new ConsoleInput();
        Tracker tracker = new Tracker();
        new StartUI().init(input, tracker);
    }
}

