package ru.job4j.search;

import java.util.ArrayList;
import java.util.function.Predicate;

public class PhoneDictionary {
    private final ArrayList<Person> persons = new ArrayList<Person>();

    public void add(Person person) {
        this.persons.add(person);
    }

    public ArrayList<Person> find(String key) {
        Predicate<Person> predicateAddress = person -> key.contains(person.getAddress());
        Predicate<Person> predicatePhone = person -> key.contains(person.getPhone());
        Predicate<Person> predicateName = person -> key.contains(person.getName());
        Predicate<Person> predicateSurname = person -> key.contains(person.getSurname());
        Predicate<Person> combine = predicateAddress.or(predicatePhone).or(predicateName).or(predicateSurname);
        ArrayList<Person> result = new ArrayList<>();
        for (var p: persons) {
            if(combine.test(p)){
                result.add(p);
            }
        }
        return result;
    }
}
