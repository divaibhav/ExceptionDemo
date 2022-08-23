package com.demo;

public class CastingDemo {
    public static void main(String[] args) {
        Object o = new CastingDemo();
        // o.display();
        CastingDemo castingDemo = (CastingDemo) o;
        castingDemo.display();
        String name = "Ramesh";
        castingDemo = (CastingDemo) ((Object)name);
        System.out.println(o);
    }
    public void display(){
        System.out.println("demo");
    }

    @Override
    public String toString() {
        return "CastingDemo{}";
    }
}
