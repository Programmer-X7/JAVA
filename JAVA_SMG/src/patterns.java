public class patterns{
    public static void main(String[] args) {
        // Printing different types of patterns in Java
        
        // 1.
        // * * * *     
        // * * * *     
        // * * * *     
        // * * * *     -  print this!

        // for(int i=1;i<=4;i++){
        //     for(int j=1;j<=4;j++){
        //         System.out.print("* ");
        //     }
        // System.out.println();
        // }

        

        
        // 2.
        // * * * * *
        // *       *
        // *       *
        // * * * * *     - print this!
        
        // int n = 4;
        // int m = 5;
        // for(int i = 1; i <=n; i++){
        //     for(int j = 1; j <= m; j++){
        //         if(i == 1 || j == 1 || i == n || j == m){
        //             System.out.print("* ");
        //         }
        //     else
        //         System.out.print("  ");
        //     }
        // System.out.println();
        // }




        // 3.
        // *      
        // * *     
        // * * *   
        // * * * *     -  print this!

        // for(int i = 1; i <= 4; i++){
        //     for(int j = 1; j <= i; j++){
        //         System.out.print("* ");
        //     }
        // System.out.println();
        // }




        // 4.
        // * * * *     
        // * * *     
        // * *     
        // *            -  print this!

        // for(int i = 4; i >=1; i--){
        //     for(int j = i; j >= 1; j--){
        //         System.out.print("* ");
        //     }
        //     System.out.println();
        // }




        // 5.
        //       *
        //     * *
        //   * * *
        // * * * *      - print this!

        // int n = 4;
        // for(int i = 1; i <= n; i++){
        //     for(int j = 1; j <= n-i; j++){
        //         System.out.print("  ");
        //     }
        // for(int j = 1; j <= i; j++){
        //     System.out.print("* ");
        // }
        // System.out.println();
        // }



        // 6.

        // 1 
        // 1 2 
        // 1 2 3 
        // 1 2 3 4 
        // 1 2 3 4 5        - print this!

        // int n = 5;
        // for(int i = 1; i <= n; i++){
        //     for(int j = 1; j <= i; j++){
        //         System.out.print(j+" ");
        //     }
        // System.out.println();
        // }



        // 7.

        // 1 2 3 4 5 
        // 1 2 3 4 
        // 1 2 3 
        // 1 2 
        // 1 

        // int n = 5;
        // for(int i = 1;i <= n; i++){
        //     for(int j = 1; j <= n-i+1; j++){
        //         System.out.print(j + " ");
        //     }
        // System.out.println();
        // }



        // 8.

        // 1 
        // 2 3 
        // 4 5 6 
        // 7 8 9 10 
        // 11 12 13 14 15 

        // int n = 5;
        // int number = 1;

        // for (int i = 1; i <= n; i++){
        //     for(int j = 1; j <= i; j++){
        //         System.out.print(number + " ");
        //         number++;
        //     }
        // System.out.println();
        // }
        


        // 9.

        // 1 
        // 0 1 
        // 1 0 1 
        // 0 1 0 1 
        // 1 0 1 0 1        - print this!
       
        // int n = 5;
        // for(int i = 1; i <= n; i++){
        //     for(int j = 1; j <= i; j++){
        //         int sum = i+j;
        //         if(sum % 2 == 0){
        //             System.out.print("1 ");
        //         }else{
        //             System.out.print("0 ");
        //         }
        //     }
        //     System.out.println();
        // }
    }
} 