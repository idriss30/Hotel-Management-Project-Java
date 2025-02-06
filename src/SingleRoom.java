package src;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * This class represents a single room in the hotel
 * stores customer information and the list of ordered food
 */
public class SingleRoom implements Serializable {
    /** Customer name */
    String name;
    /** Customer contact */
    String contact;
    /** Customer gender */
    String gender;
    /** list of foof ordered by the occupant */
    ArrayList<Food> food = new ArrayList<>();

    /** Constructs empty single room */
    SingleRoom() {
        this.name = "";
    }

    /**
     * Constructs a single room object with the following parameters:
     * 
     * @param name    a string representing the customer's name
     * @param contact a string representing the customers's contact
     * @param gender  a string representing the customer's gender
     */
    SingleRoom(String name, String contact, String gender) {
        this.name = name;
        this.contact = contact;
        this.gender = gender;
    }
}
