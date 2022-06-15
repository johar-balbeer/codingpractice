package com.ds.practice;

// https://www.geeksforgeeks.org/write-a-c-function-to-print-the-middle-of-the-linked-list/
public class LinkedListMid {

    Node head;

    class Node {
        int data;
        Node next;
        Node(int d) {
            data = d;
            next = null;
        }
    }

    void printMiddle() {
        Node slow_ptr = head;
        Node fast_ptr = head;

        while (fast_ptr != null && fast_ptr.next != null) {
            fast_ptr = fast_ptr.next.next;
            slow_ptr = slow_ptr.next;
        }
        System.out.println("The middle element is [" + slow_ptr.data + "] \n");

    }

    public void push(int new_data) {
        Node new_node = new Node(new_data);
        new_node.next = head;
        head = new_node;
    }

    public static void main(String [] args) {
        LinkedListMid llist = new LinkedListMid();
        for (int i=10; i>0; --i) {
            llist.push(i);
        }
        llist.printMiddle();
    }


}
