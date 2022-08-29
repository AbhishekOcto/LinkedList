package com.bridgelabz.linkedList;

public class LinkedList {
    Node head;

    class Node{ // created a class node
        int data;
        Node next;
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    public void addFirst(int data) {
        //checking corner case

        Node newNode = new Node(data);
        if(head == null) {
            head = newNode;
            return;

        }
        newNode.next = head;
        head = newNode;
    }
    //creating print method
    public void printlist() {

        if (head == null) {
            System.out.println("list is empty");
            return;
        }
        Node currNode = head;
        while (currNode != null) {
            System.out.print(currNode.data+ "-->");
            currNode = currNode.next;
        }
        System.out.println("Null");
    }
}
