package com.sample;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionSample {
    public static void main(String[] args) {
        boolean flag = true;
        Scanner scanner = new Scanner(System.in);

        System.out.println("enter number");
       /* int number = scanner.nextInt();
        System.out.println("number = " + number);*/
        while (flag) {
            int number = 0;
            try {
                number = scanner.nextInt();
                System.out.println(number);
                flag = false;

            } catch (InputMismatchException e) {
                System.out.println(e);
                System.out.println("enter integer value");
                scanner.nextLine();
            }

        }

    }
}
