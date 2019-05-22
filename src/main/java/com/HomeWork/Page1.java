package com.HomeWork;

import java.util.ArrayList;
import java.util.List;

public class Page1 {
    public static void main (String[] args){

        List luckyNumber = new ArrayList();

        luckyNumber.add("4, 8, 15, 16, 23, 42");
        luckyNumber.add(0, "4");

        System.out.println(luckyNumber.size());
    }
}
