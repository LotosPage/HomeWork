package com.draft;

public class MyClass {

    static void myFunction(int a, int b){

        int result = a + b;

        System.out.println("a + b = " + result);
    }
    static int myFunction2(int a, int b){
        return a + b;
    }

    public static void main(String[] args){
        myFunction(123,22332);
//        2myFunction2
        int result = myFunction2(321, 324);
        System.out.println(result);
    }
}
