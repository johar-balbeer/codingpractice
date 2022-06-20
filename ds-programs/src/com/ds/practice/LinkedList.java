package com.ds.practice;

public class LinkedList {

    Node head=null;
     class Node{
        int value;
        Node next;
        Node(int value) {
            this.value=value;
            this.next=null;
        }
    }

     void push(int data) {
        Node node = new Node(data);
        node.value = data;
        node.next=head;
        head=node;
    }

    void detectLoop(LinkedList linkedList){
         Node slowPointer=head;
         Node fastPointer=head;
         while(slowPointer!=null && fastPointer!=null && fastPointer.next!=null){
              slowPointer=slowPointer.next;
              fastPointer=fastPointer.next.next;
              if(slowPointer==fastPointer){
                  System.out.println("cycle found at "+fastPointer.value);
                  break;
              }
         }
    }

    void middleElement(LinkedList linkedList){
      Node slowPointer=head;
      Node fastPointer=head;
      while(fastPointer!=null && fastPointer.next!=null){
          fastPointer=fastPointer.next.next;
          slowPointer=slowPointer.next;
      }
      System.out.println("middle element is"+slowPointer.value);

    }

    public static void main(String[] args) {
        LinkedList linkedListCycle=new LinkedList();
        linkedListCycle.push(10);
        linkedListCycle.push(15);
        linkedListCycle.push(20);
        linkedListCycle.push(25);
        linkedListCycle.head.next.next.next =linkedListCycle.head;
        linkedListCycle.detectLoop(linkedListCycle);

        LinkedList linkedList=new LinkedList();
        linkedList.push(10);
        linkedList.push(15);
        linkedList.push(20);
        linkedList.push(25);
        linkedList.push(30);
        linkedList.push(35);
        linkedList.push(40);
        linkedList.middleElement(linkedList);
    }

}
