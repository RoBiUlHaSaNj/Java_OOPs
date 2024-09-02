/*Getter: A method that returns the value of a private instance variable. The naming 
  convention is get followed by the variable name with the first letter capitalized.

Setter: A method that sets or updates the value of a private instance variable. The 
 naming convention is set followed by the variable name with the first letter capitalized.*/


public class Person {
    // Private instance variables
    private String name;
    private int age;

    // Getter for name
    public String getName() {
        return name;
    }

    // Setter for name
    public void setName(String name) {
        this.name = name;
    }

    // Getter for age
    public int getAge() {
        return age;
    }

    // Setter for age
    public void setAge(int age) {
        if (age > 0) { // Additional validation to ensure age is positive
            this.age = age;
        } else {
            System.out.println("Please enter a valid age.");
        }
    }
}

/*Name: John Doe
Age: 25*/
