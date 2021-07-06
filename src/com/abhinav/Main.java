package com.abhinav;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        // Random number generator
        Scanner sc = new Scanner(System.in);
        int myNumber = (int) (Math.random() * 100);
        int userNumber =0;


        do {
            System.out.println("Guess my number (1-100) :");
            userNumber = sc.nextInt();
            if (userNumber == myNumber) {
                System.out.println(" BOOM ..... CONGRATS CORRECT ANSWER ...");
                break;
            } else if (userNumber > myNumber) {
                System.out.println(" YOUR NUMBER IS TOO LARGE ");
            } else {
                System.out.println(" YOUR NUMBER IS TOO  SMALL ");
            }

        } while(userNumber >= 0) ;

            System.out.print(" my number was:  ");

            System.out.println(myNumber);



    }
    }

