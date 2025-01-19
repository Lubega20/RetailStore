/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package me.retailstore;

/**
 *
 * @author ME
 */
public class RetailStore {

    public static void main(String[] args) {
        // Declare and initialize the array to store product names
        String[] productNames = {"Water", "Milk", "Bread", "Soda", "Yoghourt"};

        double[] productPrices = {12.99, 19.99, 5.49, 29.99, 15.75};

        for (int i = 0; i < productNames.length; i++) {
            System.out.println(productNames[i] + " - Price: $" + productPrices[i]);
        }
    }
}

