import java.util.*;

public class FunctionInJava {
    public static int calculateSum(int num1, int num2) {
        int sum = num1 + num2;
        return sum;
    }

    public static int calculateMul(int num1, int num2) {
        int mul = num1 * num2;
        return mul;
    }

    public static void calculateFactorial(int n){
        if(n <= 0){
            System.out.println("invalid input");
            return;
        }
        int factorial = 1;
        for(int i = n; i >= 1; i--)
            factorial = factorial * i;
        System.out.println(factorial);
        return;
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int num1 = sc.nextInt();
            int num2 = sc.nextInt();
            int n = sc.nextInt();

            int sum = calculateSum(num1, num2);
            int mul = calculateMul(num1, num2);

            
            System.out.println(sum);
            System.out.println(mul);
            calculateFactorial(n);
        }
    }
}
