/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package me.retailstore;

/**
 *
 * @author ME
 */
public class WeeklySales {
    // Declare a 2D array to store sales data for products over 7 days
    private double[][] weeklySales;

    // Constructor to initialize the weekly sales data
    public WeeklySales(double[][] weeklySales) {
        this.weeklySales = weeklySales;
    }

    // Method to calculate the total weekly sales for each product
    public double[] calculateTotalSales() {
        // Array to store the total sales for each product
        double[] totalSales = new double[weeklySales.length];

        // Loop through each product (row) to calculate the total sales for that product
        for (int i = 0; i < weeklySales.length; i++) {
            double total = 0;
            for (int j = 0; j < weeklySales[i].length; j++) {
                total += weeklySales[i][j]; 
            }
            totalSales[i] = total; 
        }

        return totalSales; 
    }
}

