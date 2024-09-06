package org.launchcode;
import java.util.Scanner;

public class MilesPerGallon {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("How many miles have you driven: ");
        Double mileageDriven = input.nextDouble();

        System.out.println("How many gallons of gasoline have you consumed: ");
        Double gasolineConsumed = input.nextDouble();

        Double mpg = mileageDriven / gasolineConsumed;

        System.out.println("Your miles-per-gallon is: " + mpg);
    }
}
