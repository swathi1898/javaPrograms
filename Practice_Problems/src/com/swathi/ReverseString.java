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


}
