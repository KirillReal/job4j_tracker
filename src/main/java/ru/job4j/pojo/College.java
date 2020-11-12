package ru.job4j.pojo;
import java.util.Date;
public class College {
    public static void main(String[] args) {
        Student student = new Student();
        student.setName("Danilov Kirill Andreevich");
        student.setNumberOfGroup("381802");
        student.setReceiptDate(new Date());
        System.out.println("Student:" + student.getName()
                + System.lineSeparator()
                + student.getNumberOfGroup()
                + System.lineSeparator()
                + student.getReceiptDate());
    }
}
