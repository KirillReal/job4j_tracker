package ru.job4j.stream;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StudentToMap {
    public static List<Student> studentsToMap(List<Student> students){
        return (List<Student>) students.stream().distinct().collect(Collectors.toMap(student -> student.getSurname(),
                student -> student));
    }
}
