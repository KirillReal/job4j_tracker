package ru.job4j.stream;

import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import static java.util.stream.Collectors.toMap;

public class StudentToMap {
    public static List<Student> studentsToMap(List<Student> students){
        Map<String, Student> map;
        map = students.stream().collect(toMap(
                Student::getSurname,
                student -> student,
                (o1,o2 ) -> o1, TreeMap::new));
        return (List<Student>) map;
    }
}
