package com.HomeWork;

import java.util.Scanner;

public class Page8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String secretWord = "sparrow";
        String guess = "";
        int guessCount = 0;
        int guessLimit = 3;

        while(!secretWord.equals(guess) && guessLimit>guessCount){
            guessCount +=1;
            System.out.println("Enter secret word: ");
            guess = in.next();
        }
        if (secretWord.equals(guess)){
            System.out.println("YOU WIN!!!");
        }
        else{
            System.out.println("You loss!");

        }
    }
}
//сы


