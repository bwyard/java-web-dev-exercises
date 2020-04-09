package exercises;

import java.util.Scanner;

public class AreaOfRectangle {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the length for the rectangle:");
        double length = input.nextDouble();
        System.out.println("Enter the width for the rectangle:");
        double width = input.nextDouble();
        input.close();
        double area = width*length;
        System.out.println("The total area of the rectangle is " + area +" units squared.");
    }
}
