package com.programmespractice.StringPrograms;

import java.util.Scanner;

//prints the words at even index
public class EvenLengthWordInString {

    public static void evenIndexCharacters(String str){
        for(int i = 0; i<str.length(); i++){
            if (i % 2 == 0 ) {
                System.out.println("Even index characters : " +str.charAt(i));
            }else{
                System.out.println("Odd index character :  " +str.charAt(i));
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String :");
        String str = sc.nextLine();

        evenIndexCharacters(str);
    }
}
