package com.demo;

public class QuickCheckCode {
    public static void main(String[] args) {
        try{
            int num1 = 0;
            int num2 = 20 / num1;
        }catch (NullPointerException e){
            System.out.println("divide by zero");
        }finally {
            System.out.println("inside finally");
        }
        System.out.println("this will get printed");
    }
}
