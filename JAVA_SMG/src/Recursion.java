import java.util.*;

public class Recursion {

    //Q1. Print 1 to 5 using recursion

//    public static void printNumber(int n) {
//        if (n > 5) {
//            return;
//        }
//        System.out.println(n);
//        printNumber(n+1);
//    }
//    public static void main(String[] args) {
//        int n = 1;
//        printNumber(n);
//    }



    //Q2. Print sum of first n natural numbers
//    public static void printSum(int i, int n, int sum) {
//        if (i == n) {
//            sum += i;
//            System.out.println(sum);
//            return;
//        }
//        sum += i;
//        printSum(i+1, n, sum);
//    }
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the value of n: ");
//        int n = sc.nextInt();
//
//        int i = 1;
//        int sum = 0;
//
//        printSum(i, n, sum);
//
//    }



    //Q3. Print Factorial of number n

//    public static int calcFact(int n) {
//        if (n == 1 || n == 0) {
//            return 1;
//        }
//        int fact_nm1 = calcFact(n-1);
//        int fact_n = n * fact_nm1;
//        return fact_n;
//
//    }
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the value of N: ");
//        int n = sc.nextInt();
//
//        int ans = calcFact(n);
//        System.out.println(ans);
//    }
}
