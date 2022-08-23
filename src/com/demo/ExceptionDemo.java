package com.demo;

import java.util.Scanner;

public class ExceptionDemo {
    public static void main(String[] args) {
        int[] age = {60,5,89,100,91,4,78,30,32,45};
        Scanner scanner = new Scanner(System.in);
        try{
            for (int i = 0; i < age.length; i++) {
                System.out.println(age[i]);
            }
            System.out.println("from try block");
            int[] arr = new int[10];
            arr = null;
            //System.out.println(arr.length);
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("invalid index");
            System.out.println(e);
        }catch (NegativeArraySizeException e){
            System.out.println("please choose size of array 0 or greater than zero");
            System.out.println(e);
        }catch (Exception e){
            System.out.println(e);
        }
        finally {
            System.out.println("will executed if exception occurs or not");
            scanner.close();
        }
        System.out.println("from main method");


    }
}
