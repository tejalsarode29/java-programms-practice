package com.programmespractice.MatrixProgram;

import java.util.Scanner;

public class SumOfMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a[][] = new int[2][2]; //means columns contains 2 values and rows contain 2 values.
        int b[][] = new int[2][2];
        int c[][] = new int[2][2];

        System.out.println("Enter first Matrix Data");

        for(int i= 0 ; i<2 ;i++){ //for rows
            for(int j =0 ;j<2 ;j++){ //for columns
                a[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter second matrix Data");

        for(int i= 0 ; i<2 ;i++){
            for(int j =0 ; j<2 ; j++){
                b[i][j]=sc.nextInt();
            }
        }

        System.out.println("Print first Matrix");
        for(int i= 0 ; i<2 ;i++){
            for(int j =0 ;j<2 ;j++){
               System.out.println(a[i][j]+" ");
            }
            System.out.println("\n");
        }

        System.out.println("Print Second Matrix");
        for(int i= 0 ; i<2 ;i++){
            for(int j =0 ;j<2 ;j++){
               System.out.println(b[i][j]+" ");
            }
            System.out.println("\n");
        }

        System.out.println("Addition of two matrix");
        for (int i =0 ;i<2;i++){
            for (int j=0;j<2;j++){
               c[i][j] =a[i][j]+b[i][j];
               System.out.print("Result " + c[i][j]+" ");
            }
            System.out.println("\n");
        }




        
}
}