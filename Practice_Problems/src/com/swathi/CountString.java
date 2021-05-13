package com.swathi;

public class CountString {
    public static void main(String[] args) {
        countString("name");
        String st = "hello";
        if (unique(st)) {
            System.out.println("String '" +st + "' has unique characters");

        }else{
            System.out.println("String '"+st  + "' has duplicate characters in it.");    }

    }

    public static void countString(String str){
        byte[] name = str.getBytes();

      System.out.println("String length = "+name.length);

    }
    public static boolean unique(String str){
        byte[] st = str.getBytes();

        for(int i =0;i<st.length;i++) {
//            int count = 1;
//            if((str.charAt(i) == str.charAt(count+i)) && (count+i)<st.length ){
//                return false;
//            }else{
//                return true;
//            }
            for (int j = i + 1; j < st.length;j++) {
                System.out.println("i:"+str.charAt(i) +" j:"+str.charAt(j));
                if (str.charAt(i) == str.charAt(j)) {

                    return false;
                }
            }
        }
        return true;

    }
}
