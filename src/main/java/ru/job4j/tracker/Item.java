package ru.job4j.tracker;

import java.time.LocalDateTime;
public class Item {
    private int id;
    private String name;
    private LocalDateTime created = LocalDateTime.now();
    public int getId() {
        return id;
    }

    public LocalDateTime getCreated() {
        return created;
    }
    public Item(){
    }
    public Item(String name){
        this.name = name;
    }
    public Item(int id){
        this.id = id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}