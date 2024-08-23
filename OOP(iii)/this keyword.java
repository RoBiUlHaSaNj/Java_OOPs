In Java, the final keyword is used to indicate that something cannot be changed or modified.
It can be applied to variables, methods, and classes, each with a different effect:

Final Variables:

When a variable is declared as final, its value cannot be changed once it is initialized. This makes the variable a constant.
Example:

final int MAX_VALUE = 100;
MAX_VALUE = 200; // This will cause a compilation error

Final Methods:

A method declared as final cannot be overridden by subclasses. This is useful when you want to 
ensure that the method's behavior remains consistent across all subclasses.


class Parent {
    final void display() {
        System.out.println("This is a final method.");
    }
}

class Child extends Parent {
    void display() { // This will cause a compilation error
        System.out.println("Attempting to override.");
    }
}

Final Classes:

A class declared as final cannot be subclassed. This means no other class can inherit from it. 
  This is often used to prevent the creation of subclasses that might alter or misuse the class's functionality.

  
final class ImmutableClass {
    // class content
}

class SubClass extends ImmutableClass { // This will cause a compilation error
    // subclass content
}
In summary, the final keyword is a way to enforce certain constraints in your code,
  ensuring that certain variables, methods, or classes remain unchanged or unaltered.
