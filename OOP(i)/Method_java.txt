
public class Calculator {
    
    // Method with no return value (void) and no parameters
    public void greet() {
        System.out.println("Welcome to the Calculator!");
    }
    
    // Method with a return value and parameters
    public int add(int a, int b) {
        return a + b;
    }

    // Method with multiple parameters
    public double multiply(double x, double y) {
        return x * y;
    }

    // Method that checks if a number is even
    public boolean isEven(int number) {
        return number % 2 == 0;
    }

    // Method that returns nothing (void) and accepts parameters
    public void printSum(int a, int b) {
        int sum = add(a, b);
        System.out.println("The sum of " + a + " and " + b + " is: " + sum);
    }
}

public class Main {
    public static void main(String[] args) {
        // Create an object of the Calculator class
        Calculator calc = new Calculator();

        // Call the greet method
        calc.greet();

        // Call the add method and store the result
        int sum = calc.add(5, 10);
        System.out.println("Sum: " + sum);

        // Call the multiply method and store the result
        double product = calc.multiply(3.5, 2.0);
        System.out.println("Product: " + product);

        // Call the isEven method and store the result
        boolean isEven = calc.isEven(4);
        System.out.println("Is 4 even? " + isEven);

        // Call the printSum method
        calc.printSum(7, 8);
    }
}
