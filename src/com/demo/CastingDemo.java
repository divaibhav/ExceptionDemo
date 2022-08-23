package com.demo;

public class CastingDemo {
    public static void main(String[] args) {
        Object o = new CastingDemo();
        // o.display();
        CastingDemo castingDemo = (CastingDemo) o;
        castingDemo.display();
    }
    public void display(){
        System.out.println("demo");
    }
}
