In Java, the super keyword is used to refer to the superclass (parent class) of an object.
It serves several important purposes when working with inheritance. Here’s how super is used:

1. Accessing Superclass Constructors

The super() call is used to invoke a superclass's constructor. If you don't explicitly call super(),
the compiler automatically inserts it as the first line in the subclass constructor, provided that 
the superclass has a no-argument constructor. If the superclass does not have a no-argument constructor,
you must call super(arguments) with appropriate arguments matching the constructor in the superclass.

class Parent {
    Parent() {
        System.out.println("Parent class constructor");
    }
}

class Child extends Parent {
    Child() {
        super(); // Calls the Parent class constructor
        System.out.println("Child class constructor");
    }
}

public class Test {
    public static void main(String[] args) {
        Child child = new Child();
    }
}

Output:

Parent class constructor
Child class constructor

2. Accessing Superclass Methods

super.methodName() can be used to call a method from the superclass that has been overridden in the subclass.
This is useful when you want to extend or modify the behavior of a method in the subclass while still retaining the original behavior from the superclass.

class Parent {
    void display() {
        System.out.println("Display method in Parent class");
    }
}

class Child extends Parent {
    void display() {
        super.display(); // Calls the display method from the Parent class
        System.out.println("Display method in Child class");
    }
}

public class Test {
    public static void main(String[] args) {
        Child child = new Child();
        child.display();
    }
}


Display method in Parent class
Display method in Child class

3. Accessing Superclass Variables
super.variableName can be used to access a variable from the superclass when there’s a name 
conflict between the superclass and subclass variables.


class Parent {
    int x = 10;
}

class Child extends Parent {
    int x = 20;

    void display() {
        System.out.println("x in Child class: " + x);
        System.out.println("x in Parent class: " + super.x); // Accesses the x from the Parent class
    }
}

public class Test {
    public static void main(String[] args) {
        Child child = new Child();
        child.display();
    }
}
Output:

x in Child class: 20
x in Parent class: 10

Summary
1.super is a keyword that refers to the superclass of the current object.
2.It is used to invoke the superclass's constructor, call methods of the superclass, and access superclass variables.
3.This allows you to build on the behavior defined in the superclass while adding or modifying functionality in the subclass.
