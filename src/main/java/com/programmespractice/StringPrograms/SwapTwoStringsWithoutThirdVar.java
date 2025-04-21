package com.programmespractice.StringPrograms;

public class SwapTwoStringsWithoutThirdVar {


    public static void main( String[] args )
    {
        String a = "Gaurav";
        String b = "Tejal";

        // Expected Output: a = Tejal b = Gaurav
        
        a = a + b; // GauravTajal
        b = a.substring(0, a.length() - b.length()); // 11-6  (0, 6) //Gaurav
        a = a.substring(b.length());                            // ( 5 remove first 6 chars) //tejal

        System.out.println("a: " + a);
        System.out.println("b: " + b);
        
    }
    
}
