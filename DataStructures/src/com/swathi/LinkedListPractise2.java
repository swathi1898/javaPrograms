package com.swathi;

public class LinkedListPractise2 {
        Node head;
        static class Node {
            int data;
            Node next;
            Node(int d) //constructors
            {
                data = d;
                next = null;
            }
        }
        public void addAtLast(Node node){
            //adding the nodes
            if(head == null)
                head = node;
            else{
                Node t = head;
                while (t.next != null)
                    t = t.next;
                t.next = node;
            }
        }

        public void printList()
        {
            Node n = head;
            while (n != null) {
                System.out.print(n.data + " ");
                n = n.next;
            }
            System.out.println("\n");
        }


        public static void main(String[] args)
        {

            LinkedListPractise2 list = new LinkedListPractise2();
            System.out.println("-----------------Basic Introduction-------------------");
            list.head = new Node(1);
            Node second = new Node(2);
            Node third = new Node(3);
            list.head.next = second;
            second.next = third;
            list.printList();
            System.out.println("-----------------Merge list-------------------");
            LinkedListPractise2 l1 = new LinkedListPractise2();
            LinkedListPractise2 l2 = new LinkedListPractise2();

            l1.addAtLast(new Node(2));
            l1.addAtLast(new Node(4));
            l1.addAtLast(new Node(6));

            l2.addAtLast(new Node(1));
            l2.addAtLast(new Node(3));
            l2.addAtLast(new Node(5));

            l1.head = new Merge().sortedMerge(l1.head, l2.head);
            l1.printList();

            

        }
    static class Merge
    {
        // Merging nodes
        Node sortedMerge(Node NodeA, Node NodeB)
        {

            Node dummyNode = new Node(0);

            Node tail = dummyNode;
            while(true)
            {
            //NodeA 2 4 6
            //NodeB 1 3 5
                if(NodeA == null) //if NodeA-null &NodeB-1 3 5
                {
                    tail.next = NodeB; //Check NodeA every Time then add the nodeB
                    break;
                }
                if(NodeB == null)//if NodeB-null &NodeA-2 4 6
                {
                    tail.next = NodeA; //Check NodeB every Time then add the nodeA
                    break;
                }

                if(NodeA.data <= NodeB.data) //A=2 <= B=1 -> no || A-2<=B=3->Yes ||
                {
                    tail.next = NodeA;//t.nx= 2
                    NodeA = NodeA.next;
                }
                else//A-2 <= B-1 -> no
                {
                    tail.next = NodeB; //t.nx =1
                    NodeB = NodeB.next;// B-3
                }

                System.out.println("tail: "+tail.data+" ta.nx: "+tail.next.data);
                /* Advance the tail */
                tail = tail.next;
            }
            System.out.println("dummy.nx: "+ dummyNode.next.data);
            return dummyNode.next;
        }
    }

}
