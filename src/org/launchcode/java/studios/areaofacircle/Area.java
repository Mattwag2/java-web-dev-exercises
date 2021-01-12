package org.launchcode.java.studios.areaofacircle;

import java.util.Scanner;

public class Area {
    public static void main(String[] args) {

                Scanner input = new Scanner(System.in);
            System.out.println("Please enter the radius of the circle: ");
            double  radius = input.nextDouble();
            input.close();
            //area = 3.14 * radius * radius;
            if (radius >0) {
                double area = Circle.getArea(radius);
                System.out.println("The area of a circle of radius " + radius + "is: " + area);
            } else {
                System.out.println("Invalid entry");
            }

    }
}
