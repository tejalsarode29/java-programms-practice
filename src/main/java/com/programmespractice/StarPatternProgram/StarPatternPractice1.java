package com.programmespractice.StarPatternProgram;
// *
// **
// ***
// ****
// *****
public class StarPatternPractice1 {
    public static void main(String[] args) {
        for(int i =1 ; i<=5;i++){
            for(int j=1 ; j<=i;j++){
                System.out.print("*");
            }
            System.out.println(" ");
        }

        // 1
        // 123
        // 12345
        // 1234567
        System.out.println("Second Pattern");
        for(int i = 1 ; i<=4 ; i++){
            for(int j =1 ;j<=2*i-1;j++){
                System.out.print(j);
            }
            System.out.println(" ");
        }

        System.out.println("Third Pattern");
        // 55555
        // 4444
        // 333
        // 22
        // 1

        for(int i =5 ; i>=1 ; i--){
            for(int j = 1 ; j<=i ; j++){
                System.out.print(i);
            }
            System.out.println(" ");
        }


        
        System.out.println("Pattern Four");

        // 12345
        // 1234
        // 123
        // 12
        // 1
        for(int i = 5 ; i>=1 ; i--){
            for(int j = 1 ; j<=i ; j++){
                System.out.print(j);
            }
            System.out.println(" ");
        }


        
        // 123456
        // 1234
        // 12

        System.out.println("Five Pattern");
        for(int i = 3 ; i>=1 ; i--){
            for(int j=1 ; j<=2*i;j++){
                System.out.print(j);
            }
            System.out.println(" ");
        }
      
        System.out.println("Sixth Pattern");
        //* * * * * *
        //*         * 
        //*         * 
        //*         *
        //* * * * * *

        for(int i =1 ; i<=5;i++){
            for(int j = 1 ; j<=5 ;j++){
                if((i==5||i==1||j==5||j==1)){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println(" ");
        }

        System.out.println("Nine Pattern");
        // 1 2 3 4 5
        //  1 2 3 4
        //   1 2 3
        //    1 2
        //     1

        for(int i=5; i>=1;i--){
            for(int k= 1; k<=5-i; k++){
                System.err.print(" ");
            }
            for(int j = 1 ; j<=i ;j++){
                System.out.print(j+" ");
            }
            System.out.println(" ");
        }


        System.out.println("---------------------");
         //     1
    //        1 2
    //      1 2 3
    //    1 2 3 4
    //  1 2 3 4 5
        for(int i = 1 ; i<=5 ; i++){
            for(int k=1; k<=5-i; k++){
                System.out.print(" ");
            }
            for(int j = 1 ; j<=i;j++){
                System.out.print(j);
            }
            System.out.println(" ");
        }

         //     1
        //     1 2
        //    1 2 3
        //   1 2 3 4
        //  1 2 3 4 5

        for(int i =1 ; i<=5 ; i++){
            for(int k = 1 ; k<=5-i ; k++){
                System.out.print(" ");
            } 
            for(int j =1 ; j <=i ; j++){
                System.out.print(j + " ");
            }
            System.out.println(" ");
        }
        
    }
    
}
