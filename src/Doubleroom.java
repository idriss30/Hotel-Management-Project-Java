package src;

/**
 * This class inherits from the singleRoom class and represents a double room in
 * the hotel
 * it holds information for the Second occupant
 */
public class Doubleroom extends SingleRoom {
    /** Name of the second occupant */
    String name2;
    /** contact of the second occupant */
    String contact2;
    /** Gender of the second occupant */
    String gender2;

    /** Constructs an empty Double room */
    Doubleroom() {
        this.name = "";
        this.name2 = "";
    }

    /**
     * Constructs a double room object with the following parameters
     * 
     * @param name     string name of the first occupant
     * @param contact  string contact of the first occupant
     * @param gender   string gender of the first occupant
     * @param name2    string name of the second occupant
     * @param contact2 string contact of the second occupant
     * @param gender2  string contact of the second occupant
     */
    Doubleroom(String name, String contact, String gender, String name2, String contact2, String gender2) {
        this.name = name;
        this.contact = contact;
        this.gender = gender;
        this.name2 = name2;
        this.contact2 = contact2;
        this.gender2 = gender2;
    }
}
