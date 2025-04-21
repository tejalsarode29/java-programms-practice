package com.programmespractice.StringPrograms;
//input : welcome to the java world
//output = 5
public class CountTheNumberOfWordsInString {
    public static void main(String[] args) {
        String str = new String("welcome to the java world");
       String[] str2 = str.split(" "); //convert str into array
       
        System.out.println("Number of words in string :"+str2.length);

    }
}
