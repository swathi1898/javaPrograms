package com.swathi;

public class PalindromeString {
    public static void main(String[] args) {
        String str = "sws";
        int i =0, j=str.length()-1;
        while (i<j){
            if(str.charAt(i) != str.charAt(j)){
                System.out.println(str+" is not a palindrome");
            }
            i++;
            j--;

        }
        System.out.println(str+" is a palindrome");
    }

}
