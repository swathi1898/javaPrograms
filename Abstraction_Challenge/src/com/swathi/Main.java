package com.swathi;

public class Main {

    public static void main(String[] args) {


//	MyLinkedList list = new MyLinkedList(null);
//	list.traverse(list.getRoot());

//	--------------------SearchTree-----------------------------------------
		SearchTree tree = new SearchTree(null);
		tree.traverse(tree.getRoot());
//	--------------------SearchTree-----------------------------------------


//	String stringData = "Goa Agra Chennai Mumbai Chennai Pune";
		String stringData = "5 7 6 3 2 1 0 4 9 8";
	String[] data = stringData.split(" ");
	for(String s: data){
//	    list.addItem(new Node(s));
		tree.addItem(new Node(s));
    }
//	list.traverse(list.getRoot());
//	list.removeItem(new Node("3"));
//		list.traverse(list.getRoot());
//		list.removeItem(new Node("5"));
//		list.traverse(list.getRoot());
//		list.removeItem(new Node("0"));
//		list.removeItem(new Node("4"));
//		list.removeItem(new Node("2"));
//		list.traverse(list.getRoot());
//		list.removeItem(new Node("9"));
//		list.traverse(list.getRoot());
//		list.removeItem(new Node("8"));
//		list.traverse(list.getRoot());
//		list.removeItem(new Node("6"));
//		list.traverse(list.getRoot());
//		list.removeItem(list.getRoot());
//		list.traverse(list.getRoot());
//		list.removeItem(list.getRoot());
//		list.traverse(list.getRoot());


//	--------------------SearchTree-----------------------------------------
		tree.traverse(tree.getRoot());
		tree.removeItem(new Node("3"));
		tree.traverse(tree.getRoot());
		tree.removeItem(new Node("5"));
		tree.traverse(tree.getRoot());
		tree.removeItem(new Node("0"));
		tree.removeItem(new Node("4"));
		tree.removeItem(new Node("2"));
		tree.traverse(tree.getRoot());
		tree.removeItem(new Node("9"));
		tree.traverse(tree.getRoot());
		tree.removeItem(new Node("8"));
		tree.traverse(tree.getRoot());
		tree.removeItem(new Node("6"));
		tree.traverse(tree.getRoot());
		tree.removeItem(tree.getRoot());
		tree.traverse(tree.getRoot());
		tree.removeItem(tree.getRoot());
		tree.traverse(tree.getRoot());


//	--------------------SearchTree-----------------------------------------





    }
}
