package com.example.java8features.StreamFlatMap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Student {
    String name;
    int sid;
    char gender;
    public Student(String name, int sid, char gender) {
        this.name = name;
        this.sid = sid;
        this.gender = gender;
    }
}

public class Main01_StreamFMEx03 {
    public static void main(String[] args) {
        List<Student> studentList1 = new ArrayList<Student>();
        studentList1.add(new Student("Smith",101,'M'));
        studentList1.add(new Student("John",102,'F'));

        List<Student> studentList2 = new ArrayList<Student>();
        studentList2.add(new Student("Jill",103,'M'));
        studentList2.add(new Student("James",104,'F'));
        studentList2.add(new Student("Allen",105,'M'));

        List<Student> studentList3 = new ArrayList<Student>();
        studentList3.add(new Student("Peter",106,'M'));
        studentList3.add(new Student("Alina",107,'F'));

        List<List<Student>> studentLists = Arrays.asList(studentList1,studentList2,studentList3);

        // Before Java8
        for (List<Student> studentList : studentLists) {
            for (Student student : studentList) {
                System.out.println(student.name);
                System.out.println(student.sid);
                System.out.println(student.gender);
                System.out.println("-------------");
            }
        }
        // Using Java8 flatmap
        List<String> allStudents = studentLists.stream()
                .flatMap(stuList -> stuList.stream())
                .map(s -> s.name)
                .collect(Collectors.toList());
        System.out.println(allStudents); // [Smith, John, Jill, James, Allen, Peter, Alina]

        List<String> maleStudents = studentLists.stream()
                .flatMap(stuList -> stuList.stream())
                .filter(s -> s.gender == 'M')
                .map(s -> s.name)
                .collect(Collectors.toList());
        System.out.println(maleStudents); // [Smith, Jill, Allen, Peter]

    }
}
