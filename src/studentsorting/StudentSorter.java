package studentsorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Student {
    private String name;
    private int age;
    private double gpa;

    public Student(String name, int age, double gpa) {
        this.name = name;
        this.age = age;
        this.gpa = gpa;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getGpa() {
        return gpa;
    }

    @Override
    public String toString() {
        return "Student [Name: " + name + ", Age: " + age + ", GPA: " + gpa + "]";
    }
}

class NameComparator implements Comparator<Student> {
    @Override
    public int compare(Student s1, Student s2) {
        return s1.getName().compareTo(s2.getName());
    }
}

class AgeComparator implements Comparator<Student> {
    @Override
    public int compare(Student s1, Student s2) {
        return Integer.compare(s1.getAge(), s2.getAge());
    }
}

class GpaComparator implements Comparator<Student> {
    @Override
    public int compare(Student s1, Student s2) {
        return Double.compare(s1.getGpa(), s2.getGpa());
    }
}

public class StudentSorter {
    public static void main(String[] args) {
        // Create a list of Student objects
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student("Alice", 20, 3.8));
        studentList.add(new Student("Bob", 22, 3.5));
        studentList.add(new Student("Charlie", 19, 3.9));
        studentList.add(new Student("David", 21, 3.7));

        // Sort by name
        Collections.sort(studentList, new NameComparator());
        System.out.println("\nSorted by Name:");
        studentList.forEach(System.out::println);

        // Sort by age
        Collections.sort(studentList, new AgeComparator());
        System.out.println("\nSorted by Age:");
        studentList.forEach(System.out::println);

        // Sort by GPA
        Collections.sort(studentList, new GpaComparator());
        System.out.println("\nSorted by GPA:");
        studentList.forEach(System.out::println);
    }
}
