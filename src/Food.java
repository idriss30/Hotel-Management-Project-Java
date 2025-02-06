package src;

import java.io.Serializable;

/**
 * This class represents a food item available to order
 * 
 * 
 */
public class Food implements Serializable {
    /** Integer representing the food item's number */
    int itemno;
    /** Integer representing the item's quantity */
    int quantity;
    /** Float representing the item's price */
    float price;

    /**
     * Constructs the food item by multiplying the quantity by the price
     * 
     * @param itemno   the item's number
     * @param quantity the item's quantity
     */
    Food(int itemno, int quantity) {
        this.itemno = itemno;
        this.quantity = quantity;
        switch (itemno) {
            case 1:
                price = quantity * 50;
                break;
            case 2:
                price = quantity * 60;
                break;
            case 3:
                price = quantity * 70;
                break;
            case 4:
                price = quantity * 30;
                break;
        }
    }
}