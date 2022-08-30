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
}
