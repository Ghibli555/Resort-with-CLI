// importing classes from the java.io and java.time packages.
import java.io.*;
import java.time.*;

// definition of the TravelPackage class.
public class TravelPackage implements Serializable { // tells the Java compiler that the TravelPackage class implements the Serializable interface.
    private static int nextId = 1; // keeps track of the next package ID to be assigned.
    private int packageId;
    private int custID;
    private int accID;
    private LocalDate date;
    private int duration;

    // constructor of the TravelPackae class. 
    public TravelPackage(int custID, int accID, LocalDate date, int duration) {
        this.packageId = nextId++; // Initialize the packageid field with the next avaibale package ID.
        this.custID = custID;
        this.accID = accID;
        this.date = date;
        this.duration = duration;
    }

    // getter method for retrieving the packag's ID.
    public int getPackageId() {
        return packageId;
    }

    public int getCustID() {
        return custID;
    }

    public int getAccID() {
        return accID;
    }

    public LocalDate getDate() {
        return date;
    }

    public int getDuration() {
        return duration;
    }

    // provides a string representaion of a TravelPackage object.
    @Override
    public String toString() {
        // Construct and retrun a string that describes the travel pakage. 
        return "TravelPackage [Package ID: " + packageId + ", Customer ID: " + custID + ", Accommodation ID: " + accID +
            ", Date: " + date + ", Duration: " + duration + "]";
    }
}

