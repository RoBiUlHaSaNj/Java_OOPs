//private

public class Person {
    private String name; // Accessible only within the Person class

    private void display() {
        System.out.println("Name: " + name);
    }
}

//public
public class Person {
    public String name; // Accessible from any class

    public void display() {
        System.out.println("Name: " + name);
    }
}

//protected
public class Person {
    protected String name; // Accessible within the package and by subclasses

    protected void display() {
        System.out.println("Name: " + name);
    }
}


//Default (Package-Private):

public class Person {
    String name; // Accessible only within the package

    void display() {
        System.out.println("Name: " + name);
    }
}


//Getter Method:

public class Person {
    private String name;

    // Getter for name
    public String getName() {
        return name;
    }
}


 // Setter Method

public class Person {
    private String name;

    // Setter for name
    public void setName(String name) {
        this.name = name;
    }
}
