
/*
Queastion: 
You are tasked with developing an Employee Management System where each employee has a name, 
ID, and address. The address consists of a street, city, state, and ZIP code. The address 
information is closely tied to the employee, so it makes sense to model it as an inner class.

*/




// Outer class representing an employee
class Employee {
    private String name;
    private int id;
    private Address address; // Inner class instance

    // Constructor to initialize employee details
    public Employee(String name, int id, String street, String city, String state, String zip) {
        this.name = name;
        this.id = id;
        this.address = new Address(street, city, state, zip); // Initialize the inner class
    }

    // Method to display employee details
    public void displayEmployeeDetails() {
        System.out.println("Employee ID: " + id);
        System.out.println("Employee Name: " + name);
        address.displayAddress(); // Call inner class method
    }

    // Inner class representing an address
    class Address {
        private String street;
        private String city;
        private String state;
        private String zip;

        // Constructor to initialize address details
        public Address(String street, String city, String state, String zip) {
            this.street = street;
            this.city = city;
            this.state = state;
            this.zip = zip;
        }

        // Method to display address details
        public void displayAddress() {
            System.out.println("Address:");
            System.out.println(street + ", " + city + ", " + state + " - " + zip);
        }
    }
}

// Main class to test the Employee Management System
public class EmployeeManagementSystem {
    public static void main(String[] args) {
        // Creating an employee object with address
        Employee employee = new Employee("John Doe", 101, "123 Elm St", "Springfield", "IL", "62704");

        // Displaying employee details
        employee.displayEmployeeDetails();
    }
}
