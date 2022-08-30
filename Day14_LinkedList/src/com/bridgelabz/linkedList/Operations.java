package com.bridgelabz.linkedList;

public class Operations {
    /*
    * Ability to create Linked List by adding 30 and 56 to 70
    */
    public static void addDataAtStart() {
        LinkedList linkedList = new LinkedList();
        linkedList.push(70);
        linkedList.push(30);
        linkedList.push(56);
        linkedList.print();
    }
    /*
    Ability to create Linked List by appending 30 and 70 to 56
    */
    public static void addDataAtEnd() {
        LinkedList linkedList = new LinkedList();
        linkedList.append(56);
        linkedList.append(30);
        linkedList.append(70);
        linkedList.print();
    }
    /*
    * Ability to insert 30 between 56 and 70
    * */
    public static void insertInBetween() {
        LinkedList linkedList = new LinkedList();
        Node secondNode = linkedList.push(70);
        Node firstNode = linkedList.push(56);
        Node newNode= new Node(30);
        System.out.println("Before:");
        linkedList.print();
        linkedList.insertInBetween(firstNode, newNode);
        System.out.println("After:");
        linkedList.print();
    }
}
