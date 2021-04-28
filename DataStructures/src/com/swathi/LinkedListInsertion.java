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
        //node 2 3
        // currently head = 2
        Node newNode = new Node(newData); //d =1
        newNode.next = head; //1.nx = head(2)
        head = newNode; // head = 1
    }

    public void insertAfter(Node prevNode, int newData)
    {
        // node 1 2 4 5|| p = 2 || d = 3
        if (prevNode == null)
        {
            System.out.println("previous node cannot be null");
            return;
        }
        Node newNode = new Node(newData); // d=3
        newNode.next = prevNode.next;// 3.nx = 2.nx is (4) so 3.nx = 4
        prevNode.next = newNode;// 2.nx = 3
    }
    public void delete(int d){
        //1 2 3 4 5 if d = 3
        Node each = head, prev = null; // each = 1

        if(each != null && each.data == d){
            head = each.next; //if d = 1 -> head = 2 -> nodes = 2,3,4,5
            return;
        }
        while (each != null && each.data != d){
            prev = each; // p = 1 | p =2
            each = each.next;// e = 2| e = 3
        }
        if(each == null)
            return;

        prev.next = each.next; 
    }
    public void deleteNode(int position)
    {
        //Node has 1 2 3 4 5
        //   index 0 1 2 3 4
        if (head == null)
            return;
        Node t = head;
        if (position == 0) // index- 0 head = node = 1
        {
            head = t.next;// new head = 2
            return;
        }
        for (int i=0; t!=null && i<position-1; i++){
            //i=0 -> t=1 -> t.nx= 2
            //i=1 -> t=2 -> t.nx= 3
            //i=2 -> t=3 -> t.nx= 4 then breaks condition i<(4-1)
            t = t.next;// at last t = 4
        }
        if (t == null || t.next == null)
            return;
        t.next = t.next.next; //t.nx = 4.nx = null || (i.e) t.nx.nx = null
    }



    public void append(int newData)
    {
        //node 1 2 3
        Node newNode = new Node(newData); //d = 4

        if (head == null) //when there is empty node then head will become d = 4
        {
            head = new Node(newData);
            return;
        }
        newNode.next = null; // 4->null

        Node last = head;
        while (last.next != null)//last.nx = 1.nx = 2 || 2.nx =3 || 3.nx = null break
            // last = 1
            last = last.next; // l = 2 || l= 3

        // last = 3
        last.next = newNode; // =4
    }

    public void printList()
    {
        Node n = head;
        while (n != null)
        {
            System.out.print(n.data+" ");
            n = n.next;
        }
        System.out.println("\n");
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

        li.deleteNode(5);
        li.printList();

    }
}
