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
        System.out.println("Select the options: ");
        System.out.println("1. Add the data at the start"); // UC 2 LinkedList Sequence: 56->30->70
        System.out.println("2. Add the data at the End");   // UC 3 LinkedList Sequence: 56->30->70
        System.out.println("3. Add the data in Between "); // UC 4 Sequence: 56->30->70
        while (true) {
            switch (sc.nextInt()) {
                case 1:
                    Operations.addDataAtStart();
                    break;
                case 2:
                    Operations.addDataAtEnd();
                    break;
                case 3:
                    Operations.insertInBetween();
                    break;
            }
        }
    }

}
