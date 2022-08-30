package com.bridgelabz.linkedList;
/*
* @author - Abhishek Kumar
* since - 29-08-2022
* */
import java.util.Scanner;
public class LinkedListMain {

    public static void main(String[] args) {
        System.out.println("Welcome to linkedList DataStructure Program");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1 to add the data at the start"); // UC 2
        switch (sc.nextInt()) {

            case 1:
                Operations.addDataAtStart();
                break;
        }
    }

}
