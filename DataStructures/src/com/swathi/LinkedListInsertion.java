package com.swathi;

public class LinkedListInsertion {
    Node head;
    class Node
    {
        int data;
        Node next;
        Node(int d) {
            data = d;
            next = null;
        }
    }

    public void push(int newData)
    {
        Node newNode = new Node(newData);
        newNode.next = head;
        head = newNode;
    }

    public void insertAfter(Node prevNode, int newData)
    {
        if (prevNode == null)
        {
            System.out.println("previous node cannot be null");
            return;
        }
        Node newNode = new Node(newData);
        newNode.next = prevNode.next;
        prevNode.next = newNode;
    }
    public void append(int newData)
    {
        Node newNode = new Node(newData);

        if (head == null)
        {
            head = new Node(newData);
            return;
        }
        newNode.next = null;

        Node last = head;
        while (last.next != null)
            last = last.next;

        last.next = newNode;
    }

    public void printList()
    {
        Node n = head;
        while (n != null)
        {
            System.out.print(n.data+" ");
            n = n.next;
        }
    }

    public static void main(String[] args)
    {

        LinkedListInsertion li = new LinkedListInsertion();

        li.append(4); // 4->null

        li.push(3);//3->4->null

        li.push(1); //1->3->4->null

        li.append(5);//1->3->4->5->null

        li.insertAfter(li.head, 2);//1->2->3->4->5->null

        li.printList();
    }
}
