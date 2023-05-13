import java.util.*;

public class String_HM {
    public static void main(String[] args) {

        // Q1.
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter total number of strings you want to input : ");
        int total_Strings = sc.nextInt();

        String[] arr = new String[total_Strings];
        int totLength = 0;

        System.out.println("Enter the Strings : ");
        for (int i = 0; i < total_Strings; i++) {
            arr[i] = sc.next();
            totLength = totLength + arr[i].length();
        }
        System.out.println(totLength);


        // Q2.
//        Scanner sc = new Scanner(System.in);
//        String str = sc.nextLine();
//        String result = "";
//
//        for (int i=0; i<str.length();i++) {
//            if (str.charAt(i) == 'e') {
//                result += 'i';
//            }
//            else {
//                result += str.charAt(i);
//            }
//        }
//
//        System.out.println(result);


        // Q3.
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter your email : ");
//        String email = sc.next();
//        String userName = "";
//
//        for (int i=0; i<email.length(); i++) {
//            if (email.charAt(i) == '@') {
//                userName += email.substring(0, i);
//                break;
//            }
//        }
//        System.out.println(userName);
    }
}
