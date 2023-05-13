import java.util.*;

public class ioInJava {
   public static void main(String[] args) {
      try (// taking input from the user
      Scanner sc = new Scanner(System.in)) {
         System.out.println("Input a number : ");
         int num = sc.nextInt();

         // Display the Output
         System.out.println("The number is : " + num);
      }

   }
}
