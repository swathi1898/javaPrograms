package com.swathi;

public class ReverseString {
    private String name;
    public ReverseString(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    public boolean reverse(ReverseString reverseString){

        byte[] str = reverseString.getName().getBytes();
        byte[] result = new byte[str.length];
        if(str.length<=0){
            return false;
        }
        for(int i =0;i<str.length;i++){
            result[i] = str[(str.length-i)-1];
        }
        System.out.println(new String(result));
        return true;
    }
    public static void rev(String s){
        byte[] a = s.getBytes();
        byte[] ans = new byte[a.length];
        if(s.length()<=0){
            System.out.println("INVALID");
        }
        for(int i =0;i<a.length;i++){
            ans[i] = a[(a.length-i)-1];
        }
        System.out.println(new String(ans));
    }

    public static void main(String[] args) {
        rev("swa");
            }


}
