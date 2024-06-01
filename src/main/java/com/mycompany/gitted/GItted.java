/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.gitted;

/**
 *
 * @author Dakilang Gabo
 */

import java.util.Scanner;

public class GItted {

    public static void main(String[] args) {
        // Create a Scanner object to read input from the console
        Scanner scan = new Scanner(System.in);
        
        // Prompt the user for input for x
        System.out.print("Enter value of X: ");
        int x = scan.nextInt();
        
        // Prompt the user for input for y
        System.out.print("Enter value of Y: ");
        int y = scan.nextInt();
        
        // Check if x is within the range 0 to 5
        if (x <= 5) {
            System.out.println("X is in range of 0 - 5");
        } else {
            System.out.println("X is out of bounds");
        }
        
        // Check if y is within the range 0 to 10
        if (y <= 10) {
            System.out.println("Y is in range of 0 - 10");
        } else {
            System.out.println("Y is out of bounds");
        }
        
        // Close the scanner
        scan.close();
    }
}
