package ru.job4j.search;

import java.util.ArrayList;

public class PhoneDictionary {
    private final ArrayList<Person> persons = new ArrayList<Person>();

    public void add(Person person) {
        this.persons.add(person);
    }

    public ArrayList<Person> find(String key) {
        ArrayList<Person> result = new ArrayList<>();
        for (Person name:persons) {
            if (name.getAddress().contains(key) || name.getName().contains(key)
                    || name.getPhone().contains(key)
                    || name.getSurname().contains(key)) {
                result.add(name);
            }
        }
        return result;
    }
}
