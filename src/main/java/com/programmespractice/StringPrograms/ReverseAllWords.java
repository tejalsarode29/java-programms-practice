package com.programmespractice.StringPrograms;
// input : Welcome to the java world
//output : world java the to welcome
 public class ReverseAllWords {
    public static void main(String[] args) {
        String str = new String("Welcome to the java world");
        String[] str2 = str.split(" ");
       for(int i = str2.length - 1 ; i>=0 ; i --){
        System.out.println("Reverse words in a string :"+ str2[i]);
       }
        
    }
}
