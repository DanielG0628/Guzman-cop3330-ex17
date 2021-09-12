package org.example;

/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Daniel Guzman
 */
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        //declare variables and create scanner
        int A, W, H, genderFlag;
        double r, BAC;
        Scanner sc = new Scanner(System.in);

        //Prompt user and scan inputs and check if the user entered numerical values
        System.out.println("Enter a 1 if you are male or a 2 if you are female:");
        while(!sc.hasNextInt()){
            sc.next();
            System.out.println("Enter a 1 if you are male or a 2 if you are female:");
        }
        genderFlag = sc.nextInt();
        System.out.println("How many ounces of alchohol did you have?");
        while(!sc.hasNextInt()){
            sc.next();
            System.out.println("How many ounces of alchohol did you have?");
        }
        A = sc.nextInt();
        System.out.println("What is your weight, in pounds?");
        while(!sc.hasNextInt()){
            sc.next();
            System.out.println("What is your weight, in pounds?");
        }
        W = sc.nextInt();
        System.out.println("How many hours has it been since your last drink?");
        while(!sc.hasNextInt()){
            sc.next();
            System.out.println("How many hours has it been since your last drink?");
        }
        H = sc.nextInt();

        //check to see if it is a female distribution ratio or a male distribution ratio
        if(genderFlag == 1){
            r = 0.73;
        }
        else{
            r = 0.66;
        }

        //calculations
        BAC = (A * 5.14 / W * r) - (0.015 * H);

        //output
        System.out.println("Your BAC is " + (float) BAC);
        if(BAC > 0.08)
            System.out.println("It is not legal for you to drive.");
        else
            System.out.println("It is legal for you to drive.");

        //close scanner
        sc.close();
    }
}