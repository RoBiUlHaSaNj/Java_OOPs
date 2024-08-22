// Base class
class Person {
    void eat() {
        System.out.println("Person is eating.");
    }
}

// Intermediate class
class Student extends Person {
    void study() {
        System.out.println("Student is studying.");
    }
}

// Derived class
class HighSchoolStudent extends Student {
    void attendClasses() {
        System.out.println("High school student is attending classes.");
    }
}

public class Main {
    public static void main(String[] args) {
        HighSchoolStudent student = new HighSchoolStudent();
        student.eat();          // Inherited from Person
        student.study();        // Inherited from Student
        student.attendClasses(); // Specific to HighSchoolStudent
    }
}
