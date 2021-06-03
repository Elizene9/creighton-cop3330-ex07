/*
 * UCF COP 3330 Summer 2021 Assignment 1 Solutions
 * Copyright 2021 Charlene Creighton
 */
package Exercise_7;

import java.util.Scanner;
/*
Create a program that calculates the area of a room.
Prompt the user for the length and width of the room in feet. T
hen display the area in both square feet and square meters.

Example Output
What is the length of the room in feet? 15
What is the width of the room in feet? 20
You entered dimensions of 15 feet by 20 feet.
The area is
300 square feet
27.871 square meters
The formula for this conversion is m2 = f2 × 0.09290304

Constraints
Keep the calculations separate from the output.
Use a constant to hold the conversion factor.
 */

public class ex07 {

    private static double CONV = .09290304;
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("\nWhat is the length of the room in feet? ");
        var length = input.nextInt();

        System.out.print("\nWhat is the width of the room in feet? ");
        var width = input.nextInt();

        System.out.printf("\nYou entered dimensions of %d feet by %d feet.", length, width);

        int area_ft = length * width;
        double area_sqm = area_ft * CONV;

        System.out.printf("\nThe area is\n%d square feet\n%.3f square meters", area_ft, area_sqm);
    }
}
