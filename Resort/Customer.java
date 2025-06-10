// importing classes from the java.io pacage.
import java.io.*;

// definition of the Customer class.
public class Customer implements Serializable { // tells the Java compiler that the Customer class implements the Serializable interface.
    private static int nextId = 1;// This is a static variable (a class-level variable) that keeps track of the next customer ID to be assigned.
    private int custId;
    private String name;
    private String email;
    private String skillsLevel;

    // constructor of the Customer class.

    public Customer(String name, String email, String skillsLevel) {
        this.custId = nextId++;// Initialize the custId field with the next available customer ID.
        this.name = name;
        this.email = email;
        this.skillsLevel = skillsLevel;
    }

    //getter method for retrieving the customer's ID.
    public int getCustId() {
        return custId;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getSkillsLevel() {
        return skillsLevel;
    }

    // This is the toString method, which provides a string representation of a Customer object.
    @Override
    public String toString() {
        // Construct and return a string that describes the customer.
        return "Customer [ID: " + custId + ", Name: " + name + ", Email: " + email + ", Skills Level: " + skillsLevel + "]";
    }
}
