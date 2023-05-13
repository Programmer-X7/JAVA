import java.util.*;

public class _2D_ArrayInJava {
    public static void main(String[] args) {
        int[][] matrix = new int[10][10];

        Scanner sc = new Scanner(System.in);

        int rows = sc.nextInt();
        int columns = sc.nextInt();

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        System.out.println();

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();

        // search for a specific number entered by the User
        int flag = 0;
        System.out.print("Enter the Number you want to search : ");
        int key = sc.nextInt();

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                if (matrix[i][j] == key) {
                    System.out.println("Number found at position : " + i + " , " + j);
                    flag = 1;
                    break;
                }
            }
        }

        if(flag == 0) {
            System.out.println("Number not found!");
        }
    }
}
