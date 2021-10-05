package acme.enthuware.standard_tests.starter_test.test16;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Student {
    public static enum Grade {A, B, C, D, F}

    private String name;
    private Grade grade;

    public Student(String name, Grade grade) {
        this.name = name;
        this.grade = grade;
    }

    public String toString() {
        return name + ":" + grade;
    }

    public String getName() {
        return name;
    }

    public Grade getGrade() {
        return grade;
    }

    public static void main(String[] args) {
        List<Student> ls = Arrays.asList(new Student("S1", Student.Grade.A), new Student("S2", Student.Grade.A), new Student("S3", Student.Grade.C));

        Map<Grade, List<String>> grouping = ls.stream().collect(
                Collectors.groupingBy(Student::getGrade,
                        Collectors.mapping(Student::getName, Collectors.toList())));

        System.out.println(grouping);
    }
}
