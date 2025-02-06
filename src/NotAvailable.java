package src;

/**
 * This class represents a room that is not available
 */
public class NotAvailable extends Exception {
    /**
     * Returns a string representation of the exception.
     * 
     * @return A string indicating that the room is not available.
     */
    @Override
    public String toString() {
        return "Not Available !";
    }
}