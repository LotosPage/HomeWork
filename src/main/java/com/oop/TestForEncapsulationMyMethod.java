package com.oop;

public class TestForEncapsulationMyMethod {
    public static void main (String[] args){
        EncapsulationMyMethod obj = new EncapsulationMyMethod();
        System.out.println(obj.getS());

        obj.setS("It's modified");
        System.out.println(obj.getS());
    }

}
