package com.swathi;

import java.util.Arrays;
import java.util.Stack;

public class Main {

//    public static void main(String[] args) {
//	int[] array ={1,2,3,4,5};
//        System.out.println(Arrays.toString(array));
//   reverse(array);
//        System.out.println((Arrays.toString(array)));
//    }
//    private static void reverse(int[] array){
//        int maxIndex = array.length -1;
//        int halfLength = array.length/2;
//        for(int i=0; i<halfLength;i++){
//            int temp = array[i];
//            array[i] = array[maxIndex-i];
//            array[maxIndex-i] = temp;
//        }
//
//    }

    static class Reverse{
        private int array[];
        private int top;
        private int last;
        private int capacity;

        Reverse(int size){
        array = new int[size];
        capacity = size;
        top = -1;
        last = size-1;

        }
        public boolean isFull(){
            return top == capacity-1;
        }
        public boolean isEmpty(){
            return top == -1;
        }
        public void push(int x){
            if(isFull()){
                System.out.println("overflow");
            }
            System.out.println("inserting value "+ x);
            array[++top] = x;
        }
        public int pop(){
            if(isEmpty()){
                System.out.println("empty");
            }
            last = array[--top];
            System.out.println("last value is "+last+ "array "+ array[last]+ "   "+Arrays.toString(array));
            return last;
        }
        public void printValue(){
            for(int i = 0;i<=top;i++){
                System.out.println(array[i]);
            }
            System.out.println(Arrays.toString(array));
        }


    }
    public static void main(String[] args){
        Reverse number = new Reverse(5);
        number.push(1);
        number.push(2);
        number.push(3);
        number.push(4);
        number.push(5);
        number.printValue();
        number.pop();
        number.printValue();
        number.pop();
    }
}
