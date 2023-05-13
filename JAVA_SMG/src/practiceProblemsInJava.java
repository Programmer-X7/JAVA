// // # Q1.
// import java.util.*;

// public class practiceProblemsInJava{

//     public static float calculateAvg(float number1, float number2, float number3) {
//         float avg = ((number1+number2+number3)/3);
//         return avg;
//     }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         float number1 = sc.nextFloat();
//         float number2 = sc.nextFloat();
//         float number3 = sc.nextFloat();

//         System.out.println("The avarage : " + calculateAvg(number1, number2, number3));

//     }
// }




// // # Q2.
// import java.util.*;

// public class practiceProblemsInJava{

//     public static int calSumOdd(int n){
//         int sum = 0;

//         for(int i=1; i<=n; i=i+2) {
//             sum = sum + i;
//         }
//         return sum;
//     }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter nth number : ");
//         int n = sc.nextInt();

//         System.out.println("The sum : " + calSumOdd(n));
//     }
// }




// // #Q3.
// import java.util.*;

// public class practiceProblemsInJava{

//     public static void findGreatestNumber(int number1, int number2){
        
//         if(number1 == number2)
//             System.out.println("Both are equal!");
//         else if(number1 > number2)
//             System.out.println("The greatest number is : " + number1);
//         else
//             System.out.println("The greatest number is : " + number2);
//     }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         int number1 = sc.nextInt();
//         int number2 = sc.nextInt();

//         findGreatestNumber(number1, number2);
//     }
// }





// // Q4.
// import java.util.*;

// public class practiceProblemsInJava{

//     public static void circle(){
//         double PI = 3.1415;

//         Scanner sc = new Scanner(System.in);
//         float r = sc.nextFloat();

//         System.out.println("The circumference of the circle is : " + 2*PI*r);
//     }

//     public static void main(String[] args) {
//         circle();
//     }
// }




// // #Q5.
// import java.util.*;

// public class practiceProblemsInJava{

//     public static void checkElegiblility(int age){
//         if(age >= 18)
//             System.out.println("Congrats! You can vote");
//         else
//             System.out.println("Sorry! You can't vote");
            
//     }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int age = sc.nextInt();

//         checkElegiblility(age);
//     }
// }





// #Q6.
// WARNING -->  INFINITE LOOP ****************************************
// WARNING -->  INFINITE LOOP ****************************************
// WARNING -->  INFINITE LOOP ****************************************

// public class practiceProblemsInJava{
//     public static void main(String[] args) {
//         int i = 0;
//         do{
//             System.out.println(i);
//             i++;
//         }while(true);
//     }
// }




// // # Q8.
 import java.lang.Math;
 import java.util.*;

 public class practiceProblemsInJava{
     public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         int x = sc.nextInt();
         int y = sc.nextInt();

         long value = (long) Math.pow(x, y); // Type casting

         System.out.println("The value of x to the power y : " + value);
     }
 }




//
//import java.util.*;
//
//public class practiceProblemsInJava{
//
//    public static void calculateGreatestCommonDivider(int a, int b){
//        int smallest;
//        int common;
//
//        if(a < b)
//            smallest = a;
//        else
//            smallest = b;
//
//
//        for(int i = 1; i<= smallest; i++) {
//            if(a/i == 0 && b/i ==0){
//                common = i;
//            }
//        }
//
//        System.out.println("Greatest common divider of " + a + " and " + b + " is : " + common);
//    }
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int a = sc.nextInt();
//        int b = sc.nextInt();
//
//        calculateGreatestCommonDivider(a, b);
//    }
//}