package src;

import java.io.Serializable;

/**
 * Manages room allocation in the hotel
 * Store the instances of the room types
 */
public class Holder implements Serializable {
    Doubleroom[] luxury_doublerrom = new Doubleroom[10]; // Luxury
    Doubleroom[] deluxe_doublerrom = new Doubleroom[20]; // Deluxe
    SingleRoom[] luxury_singleerrom = new SingleRoom[10]; // Luxury
    SingleRoom[] deluxe_singleerrom = new SingleRoom[20]; // Deluxe
}
