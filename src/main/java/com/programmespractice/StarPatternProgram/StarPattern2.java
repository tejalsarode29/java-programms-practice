package com.programmespractice.StarPatternProgram;

// 1
// 2 2
// 3 3 3 
// 4 4 4 4
public class StarPattern2 {
    public static void main(String[] args) {

        for(int i= 1 ;i<=4 ; i ++){
            for(int j =1 ; j<=i ;j++){
                System.out.print(i);

            }
            System.out.println(" ");
        }






        

        // 1
        // 123
        // 12345
        // 1234567

        //it starts form i to j  then j will be 2*i-1 = 

        System.out.println("Second Pattern");
        for(int i = 1 ; i<=4 ; i++){
            for(int j = 1;j<=2*i-1 ; j++){
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

        for (int i = 5 ; i>=1 ;i--){
            for(int j = 1; j<=i ; j++){
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

        for (int i = 5 ; i>=1 ;i--){
            for (int j= 1 ; j<=i ; j++){
                System.out.print(j);
            }
            System.out.println(" ");
        }


        // 123456
        // 1234
        // 12

        System.out.println("Five Pattern");
        for(int i = 4 ; i>=1 ; i--){
            for(int j = 1;j<=2*i-1;j++){
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

        int n =5;
        for(int i = 1 ; i<= n ; i++){
            for (int j = 1 ;j<= n ;j++){
                if (i==1||i==n||j==1||j==n) {
                   System.out.print("*"); 
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println(" ");
        }

        



        System.out.println("Seven Pattern");

        for(int i = 1; i<=3 ; i++){
            for(int k = 1 ;k<=3-i ;k++){
                System.out.print(" ");
            }
            for(int j=1 ; j<=i;j++){
                System.out.print("*"+" ");
            }
            System.out.println(" ");
           
        }



        System.out.println("Eight Pattern");

         //      *
        //      * *
        //     *   *
        //    *     *
        //   *       *
        //    *     *
        //     *   *
        //      * *
        //       * 

        for(int i = 1 ; i<=5 ; i++){
            for(int j = 1 ; j<=5 ; j++){
                if((i+j==4 || i+j==8 || i==4 && j==2 || i==2 && j==4 ||i==3&&j==5)){
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

        for(int i = 5 ; i>= 1 ; i --){
            for(int k = 1 ; k<=5-i; k++ ){
                System.out.print(" ");
            }
            for(int j =1 ; j<=i ; j++){
                System.out.print(j+" ");
            }
            System.out.println(" ");

        }

        System.out.println("Pattern Ten");
    //          1
    //        1 2
    //      1 2 3
    //    1 2 3 4
    //  1 2 3 4 5

        for(int i = 1 ; i<=5 ; i++){
            for(int k = 1 ; k<=5-i ; k++){
                System.out.print(" ");
            }
            for(int j = 1 ; j<=i;j++){
                System.out.print(j);
            }
            System.out.println(" ");
        }

        //      1
        //     1 2
        //    1 2 3
        //   1 2 3 4
        //  1 2 3 4 5
        System.out.println("Pattern 11");
        for(int i = 1 ; i<= 5 ; i++){
            for(int k =1 ; k<=5-i; k++){
                System.out.print(" ");
            }
            for(int j=1 ; j<=i; j++){
                System.out.print(j+" ");
            }
            System.out.println(" ");
        }

        System.out.println("Pattern 12");
        
        //       *
        //      * *
        //     * * *
        //    * * * *
        //   * * * * *
        //    * * * *
        //     * * *
        //      * *
        //       * 

        for(int i = 1 ; i<=5 ; i++){
            for(int k = 1 ; k<=5-i ; k++){
                System.out.print(" ");
            }
            for(int j = 1 ; j<=i ;j++){
                System.out.print("*" + " ");
            }
            System.out.println(" ");
        }
        for(int i = 5 ; i >=1 ;i--){
            for(int k = 1 ; k<=5-i ; k++){
                System.out.print(" ");
            }
            for(int j = 1 ; j<=i ;j++){
                System.out.print("*" + " ");
            }
            System.out.println(" ");
        }



        



    }
}
