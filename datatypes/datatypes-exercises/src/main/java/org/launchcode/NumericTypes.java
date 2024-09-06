package org.launchcode;
import java.util.Scanner;

public class NumericTypes {
    public static void main(String[] args) {
Scanner input = new Scanner(System.in);

        System.out.println("What is the rectangle's length: ");
        Double rectangleLength = input.nextDouble();
        System.out.println("What is the rectagle's width: ");
        Double rectangleWidth = input.nextDouble();
        Double rectangleArea = rectangleWidth * rectangleLength;
        System.out.println("Width " + rectangleWidth + "* " + "length " + rectangleLength + "= " + rectangleArea);
        System.out.println(rectangleArea);
    }
}
