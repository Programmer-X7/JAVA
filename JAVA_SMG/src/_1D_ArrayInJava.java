import java.util.*;

public class _1D_ArrayInJava {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array : ");
        int size = sc.nextInt();

        int arr[] = new int[size];

        System.out.println("Enter the elements : ");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + "  ");
        }
        System.out.println();

        System.out.println("Enter the value you want to search : ");
        int key = sc.nextInt();

        int flag = 0;
        int i;
        for (i = 0; i < size; i++) {
            if (arr[i] == key) {
                System.out.println("The element is found at Index : " + i);
                flag = 1;
            }
        }

        if (flag != 1) {
                System.out.println("Element not found!");
            }
    }
}
