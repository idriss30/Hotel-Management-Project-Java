package src;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

/**
 * Handles writing room data to a file for persistence.
 */
public class Write implements Runnable {
    Holder hotel_ob;

    /**
     * Constructs a Write object with the provided hotel data.
     * 
     * @param hotel_ob The hotel room data to be written.
     */
    Write(Holder hotel_ob) {
        this.hotel_ob = hotel_ob;
    }

    /**
     * Writes hotel data to a file.
     */
    @Override
    public void run() {
        try {
            FileOutputStream fout = new FileOutputStream("backup");
            ObjectOutputStream oos = new ObjectOutputStream(fout);
            oos.writeObject(hotel_ob);
            oos.close();
        } catch (Exception e) {
            System.out.println("Error in writing " + e);
        }

    }

}