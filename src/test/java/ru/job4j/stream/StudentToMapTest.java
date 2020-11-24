package ru.job4j.stream;

import org.junit.Test;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class StudentToMapTest {
    @Test
    public void convertToMap() {
        List<Student> students = List.of(
                new Student(50,"Ivanov"),
                new Student(60,"Petrov"),
                new Student(40,"Suvorov"),
                new Student(50,"Efimov")
        );
        Map<String,Student> expected = new TreeMap<>();
        expected.put("Ivanov",students.get(0));
        expected.put("Petrov",students.get(1));
        expected.put("Suvorov",students.get(2));
        expected.put("Efimov",students.get(3));
        assertThat(StudentToMap.convertToMap(students),is(expected));
    }
}