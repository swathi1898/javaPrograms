package com.swathi;

public class LinkedListPractise {
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
        for (int i=0; i<position-1; i++){
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

    public void nodeSize(){
        int count = 0;
        Node current = head;
        while (current!=null){
            current = current.next;
            count++;
        }
        System.out.println("Size of Node is "+ count);
    }
    public void swapNodes(int x, int y)
    {
        //Node 1 2 3 4 5 if x = 3 & y = 5
        if (x == y)
            return; // if x = 3 and y = 3 Don't need to change

        Node prevX = null, currentX = head; // assume px = null cx = 1(head)
        while (currentX != null && currentX.data != x) { // when cx = 3 Break
            prevX = currentX; // px = cx = 1 || px = 2
            currentX = currentX.next;// cx = cx.nx(2) || cx = 3 BREAK
        }
        // px = 2 & cx = 3
        Node prevY = null, currentY = head;// assume py = null cy = 1(head)
        while (currentY != null && currentY.data != y) {// when cy = 5 Break
            prevY = currentY; // py = cy = 1 || py = 2 || py = 3 || py = 4
            currentY = currentY.next;// cy = cy.nx(2) || cy = 3 || cy = 4 || cy = 5 BREAK
        }

        // py = 4 & cy = 5


        if (prevX != null)
            prevX.next = currentY; //px = 2 -> px.nx = cy(5)
        else
            head = currentY;// if x is head px = null then swaping the head with cY

        if (prevY != null)
            prevY.next = currentX;//py = 4 -> px.nx = cx(3)
        else
            head = currentX;// if y is head py = null then swaping the head with cx



        Node temp = currentX.next; //cx(3) -> temp = cx.nx(4)
        currentX.next = currentY.next; //cx(3).nx = cy(5).nx which is null after 3
        currentY.next = temp;//cy(5).nx = 4
        // 3 & 5 are swaped now li = 1 2 5 4 3

    }
    Node Reverse(Node node){
        Node prev = null, current = node, next = null;
        while (current!=null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        node = prev;


        return node;

    }
    public void printReverse(Node node){
        System.out.print("Reverse LinkedList: ");
        while (node != null){
            System.out.print(node.data +" ");
            node = node.next;
        }
    }
    public void printList()
    {
        Node n = head;
        System.out.print("linked list: ");
        while (n != null)
        {
            System.out.print(n.data+" ");
            n = n.next;
        }
        System.out.println("\n");
    }

    public static void main(String[] args)
    {
        LinkedListPractise li = new LinkedListPractise();
        li.append(4); // 4->null
        li.push(3);//3->4->null
        li.push(1); //1->3->4->null
        li.append(5);//1->3->4->5->null
        li.insertAfter(li.head, 2);//1->2->3->4->5->null

        li.printList();
        li.swapNodes(3, 5);

        System.out.println("After swaping 3 and 5");
        li.printList();
        li.nodeSize();
        System.out.println("Linked list after deleting node at position 4 " );
        li.deleteNode(4);
        li.printList();
        li.nodeSize();

        Node n = li.Reverse(li.head);
        li.printReverse(n);

        // -----------------------------------------------------OutPut---------------------------------------------
//        linked list: 1 2 3 4 5
//
//        After swaping 3 and 5
//        linked list: 1 2 5 4 3
//
//        Size of Node is 5
//        Linked list after deleting node at position 4
//        linked list: 1 2 5 4
//
//        Size of Node is 4
//        Reverse LinkedList: 4 5 2 1

    }
}
