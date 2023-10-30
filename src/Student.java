/*
This code defines a class called "Student" with private instance variables for name, id, and grades.
It also includes a constructor to initialize these variables.
*/

public class Student {
    private String name;
    private int id;
    private int[] grades;

    // Constructor to initialize the name, id, and grades of the student
    public Student(String name, int id, int[] grades) {
        this.name = name;
        this.id = id;
        this.grades = grades;
    }

// getter and setter methods

    public String getName() {
        return this.name;
    }
    // Getter method to retrieve the id of the student
    public int getId() {
        return this.id;
    }

    // Getter method to retrieve the grades array of the student
    public int[] getGrades() {
        return this.grades;
    }

}

