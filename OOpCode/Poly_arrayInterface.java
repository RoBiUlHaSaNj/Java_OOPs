// Interface
interface Shape {
    void draw();
}

// Class implementing the interface
class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Drawing a circle");
    }
}

// Another class implementing the interface
class Square implements Shape {
    @Override
    public void draw() {
        System.out.println("Drawing a square");
    }
}

public class Main {
    public static void main(String[] args) {
        // Array of Shape references
        Shape[] shapes = new Shape[2];
        
        // Initializing the array with different classes implementing Shape
        shapes[0] = new Circle();
        shapes[1] = new Square();
        
        // Polymorphic behavior: calling draw() method
        for (Shape shape : shapes) {
            shape.draw();  // Calls the method implemented in the respective class
        }
    }
}
