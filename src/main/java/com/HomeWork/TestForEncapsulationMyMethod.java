package com.HomeWork;

public class TestForEncapsulationMyMethod {
    public static void main (String[] args){
        EncapsulationMyMethod obj = new EncapsulationMyMethod();
        System.out.println(obj.s);

        obj.s = "It's modified";
        System.out.println(obj.s);
    }
}
