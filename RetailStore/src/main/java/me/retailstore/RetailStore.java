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
        String[] productNames = {"water", "Milk", "Bread", "Soda", "Yoghourt"};
        
        // Declare and initialize the array to store product prices
        double[] productPrices = {12.99, 19.99, 5.49, 29.99, 15.75};
        
    
        double[][] weeklySales = {
            {10.5, 12.3, 9.8, 15.2, 13.0, 14.5, 16.3},  
            {20.0, 19.5, 18.0, 22.1, 21.5, 20.3, 19.8},
            {5.4, 6.3, 7.0, 5.2, 5.8, 6.1, 6.5},        
            {30.0, 28.5, 32.1, 35.0, 33.3, 30.2, 31.1},  
            {15.5, 14.0, 13.8, 16.5, 17.0, 16.2, 15.0}  
        };

       
        WeeklySales weeklySalesObj = new WeeklySales(weeklySales);
        double[] totalSales = weeklySalesObj.calculateTotalSales();

        for (int i = 0; i < productNames.length; i++) {
            System.out.println(productNames[i] + " - Price: $" + productPrices[i] + 
                               " - Total Weekly Sales: $" + totalSales[i]);
        }
    }
}


