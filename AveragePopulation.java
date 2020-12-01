/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package averagepopulation;

import java.util.Scanner;

public class AveragePopulation {

    
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter number of males");

        String males = scr.nextLine();// Read user input
        System.out.println("Enter number of females");

        String females = scr.nextLine();// Read user input
        
        //Parse strings to get number as double for calculation
        double maleint = Double.parseDouble(males);
        double femaleint = Double.parseDouble(females);
        
        //Calculate total, male and female population
        double total = maleint + femaleint;
        double malepop = maleint/total;
        double femalepop = femaleint/total;
        
        // Output user input
        System.out.println("Total students is: ");
        System.out.format("%.0f%n", total);
        System.out.println("Male population: ");
        System.out.format("%.2f%n", malepop);
        System.out.println("Female population: ");
        System.out.format("%.2f%n", femalepop);
        
    }
    
}
