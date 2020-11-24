package ru.job4j.stream;

import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import static java.util.stream.Collectors.toMap;

public class StudentToMap {
    public static Map<String,Object> convertToMap(List<Student> students){
        return students.
                stream().
                collect(toMap(Student::getSurname, student -> student,(o1, o2) -> o2,TreeMap::new));
    }
    /*
    public static void main(String[] args) {
        List<Student> students = List.of(
                new Student(50,"Ivanov"),
                new Student(60,"Petrov"),
                new Student(40,"Suvorov"),
                new Student(50,"Efimov")
        );
        //Map<String,Object> map = students.stream().collect(toMap(Student::getSurname, student -> student,(o1,o2) -> o1,TreeMap::new));
    }
     */
}
