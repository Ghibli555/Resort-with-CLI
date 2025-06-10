// required to use input/output classes and operations.
import java.io.*;

// definition of the Accomodation class.
public class Accommodation implements Serializable { // tells the Java compiler that the Accomodation class implements the Serializable interface.
    // instance variables or fields of the class.    
    private String type;
    private int price;
    private int accID;
    private boolean availability;

    // the constructor of the Accomodation class.
    // It is called when an instance of the class is created to initialize its properties.
    public Accommodation(String type, int price, int accID) {
        // Initialize the type, price, and accID fields with the values passed as arguments.
        this.type = type;
        this.price = price;
        this.accID = accID;
        this.availability = true;// Set the availability flag to true by default when a new accommodation is created.
    }

    // getter methods for the instance variiables.
    public String getType() {
        return type;
    }

    public int getPrice() {
        return price;
    }

    public int getAccID() {
        return accID;
    }

    public boolean getAvailability() {
        return availability;
    }

    // setter method for the availablity field.
    public void setAvailability(boolean availability) {
        this.availability = availability;
    }

    // toString method. provieds a string representation of an Accommodation object.
    @Override
    public String toString() {
        // Construct and return a string that describes the accomodation.    
        return "Accommodation [Type: " + type + ", Price: $" + price + ", ID: " + accID + "]";
    }
}

