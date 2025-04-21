package com.programmespractice.StringPrograms;
//Input -- 2 strings are given 
//same length , contains the same character , 
//rotations means 
public class StringAreRotations {
    public static void main(String[] args) {
        String str = "decode";
        String str2 = "codede";

        if (str.length()==str2.length()) {
            String a = str+str;    // decodedecode  it contains codede

        

        if (a.contains(str2)) {
            System.out.println("String are Rotations");
        } else {
            System.out.println("Strings are not Rotaions");
        }
    }



    }
}
