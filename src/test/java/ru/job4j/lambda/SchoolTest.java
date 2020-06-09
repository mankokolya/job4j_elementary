package ru.job4j.lambda;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class SchoolTest {
    private final Student john = new Student(85, "John");
    private final Student ben = new Student(65, "Ben");
    private final Student anna = new Student(40, "Anna");
    private final Student ira = new Student(96, "Ira");
    private final Student bill = new Student(55, "Bill");
    private final Student ashley = new Student(45, "Ashley");
    private final List<Student> students = List.of(john, ben, anna, ira, bill, ashley);

    @Test
    public void class10A() {
        List<Student> expect = List.of(john, ira);
        List<Student> result = School.collect(students,
                student -> student.getScore() >= 70 && student.getScore() <= 100);
        assertEquals(expect, result);
    }

    @Test
    public void class10B() {
        List<Student> expect = List.of(ben, bill);
        List<Student> result = School.collect(students,
                student -> student.getScore() >= 50 && student.getScore() < 70);
        assertEquals(expect, result);
    }

    @Test
    public void class10C() {
        List<Student> expect = List.of(anna, ashley);
        List<Student> result = School.collect(students,
                student -> student.getScore() > 0 && student.getScore() < 50);
        assertEquals(expect, result);
    }
}