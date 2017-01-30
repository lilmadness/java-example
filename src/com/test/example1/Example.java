package com.test.example1;

public class Example {

    private int i = 11;
    private static int k = 22;
    private static Integer l = 33;

    public static void main(String[] args) {
        System.out.println("My first program");
        System.out.println("l: " + l);
        Example main = new Example();
        System.out.println("i: " + main.i);

        sayHello();
        main.saySomething();

    }

    private static void sayHello() {
        System.out.println("Hello!");
    }

    private void saySomething() {
        System.out.println("Something");
    }

    private Example() {

    }
}
