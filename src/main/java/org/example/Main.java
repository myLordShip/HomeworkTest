package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter something");
        System.out.println("you entered " + scanner.nextLine());

        Human adam = new Human();
        adam.setName(scanner.nextLine());
        System.out.println(adam.getName());
    }

}