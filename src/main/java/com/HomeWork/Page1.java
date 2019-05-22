package com.HomeWork;

import java.util.ArrayList;
import java.util.List;

public class Page1 {
    public static void main (String[] args){

//        List luckyNumber = new ArrayList();
//
//        luckyNumber.add("4, 8, 15, 16, 23, 42");
//        luckyNumber.add(0, "4");
//        String [] luckyNumber2 = {"4, 8, 15"}; # Array use when we know exactly amount of elements
//        and they will not be added or delete
        ArrayList<String> luckyNumber = new ArrayList<String>();
        luckyNumber.add("4");
        luckyNumber.add("8");
        luckyNumber.add("15");
        luckyNumber.add("16");
        luckyNumber.add("23");

        System.out.println(luckyNumber+ " original luckyNumber");
        System.out.println(luckyNumber.size()+ " we look how math object in the list");
        System.out.println(luckyNumber.indexOf("8")+ " we look at index 8");
        luckyNumber.set(1, "123");
        System.out.println(luckyNumber + " set \"123\" replaced 8 ");
        luckyNumber.remove(1);
        System.out.println(luckyNumber+ " remove index 1");
        luckyNumber.remove("23");
        System.out.println(luckyNumber + " remove 23");
        luckyNumber.clear();
        System.out.println(luckyNumber + " clear list");


    }
}
