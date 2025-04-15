package Devops.CIE;

import java.util.Scanner;

public class number {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 
        System.out.println("Enter the number: ");
        double number = scanner.nextDouble(); 

        if (number > 0) {
            System.out.println("The number is positive");
        } else if (number == 0) {
            System.out.println("The number is ZERO");
        } else {
            System.out.println("The number is negative");
        }
        scanner.close(); 
        System.out.println("This is b1 branch");
    }
}