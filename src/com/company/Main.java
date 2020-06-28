package com.company;

import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter first name to reverse: ");
        if (scanner.hasNext()) {
            String firstName = scanner.nextLine();
            System.out.println("Enter last name: ");
            if (scanner.hasNext()) {
                String last_name = scanner.nextLine();

                System.out.println("Your reversed name is " + last_name + " " + firstName);
            } else {
                System.out.println("Invalid input!");
            }

        } else {
            System.out.println("Invalid input!");
        }

    }
}
