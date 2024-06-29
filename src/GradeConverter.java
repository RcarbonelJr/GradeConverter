/* Author: Randall Carbonel
 * Date: 6/29/24
 * Class: ASD216 - Java Programming
 * Assignment: Create an application that converts number grades to letter grades.
 * Specifications: A    88-100
 *                 B    80-87
 *                 C    67-79
 *                 D    60-67
 *                 F    <60
 * - Assume that the user will enter valid integers between 1 and 100 for the grades.
 * - The application should continue only if the user enters “y” or “Y” to continue.
 */

import java.util.Scanner;

public class GradeConverter {
    public static void main(String[] args) {

        // Print out the name of the program
        System.out.println();
        System.out.println("Welcome to the Latter Grade Converter");
        System.out.println();

        // Create the Scanner
        Scanner sc = new Scanner(System.in);

        // Set choice so the program runs at least once
        String choice = "y";

        // While loop so the program runs until the user exits
        while (choice.equalsIgnoreCase("y")) {

            // Get user input for numerical grade
            System.out.print("Enter numerical grade: ");
            int numericalGrade = sc.nextInt();
            sc.nextLine(); // Clear the newline character

            // Print letter grade
            if (numericalGrade >= 88) {
                System.out.println("Letter grade: A");
            } else if (numericalGrade >= 80) {
                System.out.println("Letter grade: B");
            } else if (numericalGrade >= 67) {
                System.out.println("Letter grade: C");
            } else if (numericalGrade >= 60) {
                System.out.println("Letter grade: D");
            } else {
                System.out.println("Letter grade: F");
            }

            // Ask the user if they would like to continue
            System.out.print("Continue? (y/n): ");
            choice = sc.nextLine();
        }
    }
}