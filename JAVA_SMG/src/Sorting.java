import java.util.*;

public class Sorting {

    // Common Methods
     public static int[] inputArray() {

         Scanner sc = new Scanner(System.in);

         System.out.println("Enter total numbers of elements: ");
         int totalElement = sc.nextInt();

         int[] arr = new int[totalElement];
         for (int i=0; i<arr.length; i++) {
             arr[i] = sc.nextInt();
         }
         return arr;
    }

    public static void outputArray(int[] arr) {
        for (int i=0; i<arr.length; i++) {
            System.out.print(arr[i] + "  ");
        } System.out.println();
    }


    // Main Method
    public static void main(String[] args) {

        int[] arr = inputArray();

        System.out.println("Array before sorting: ");
        outputArray(arr);

        // Bubble Sort
//        for (int i=0; i<arr.length-1;i++) {
//            for (int j=0; j<arr.length-i-1; j++) {
//                if (arr[j]>arr[j+1]) {
//                    //Swap
//                    int temp = arr[j];
//                    arr[j] = arr[j+1];
//                    arr[j+1] = temp;
//                }
//            }
//        }


        //Selection Sort
//        for (int i=0; i<arr.length-1; i++) {
//            int smallest = i;
//            for (int j=i+1; j<arr.length; j++) {
//                if (arr[smallest] > arr[j]) {
//                    smallest = j;
//                }
//            }
//            //Swap
//            int temp = arr[smallest];
//            arr[smallest] = arr[i];
//            arr[i] = temp;
//        }


        // Insertion Sort
        

        System.out.println("Array after sorting: ");
        outputArray(arr);

    }
}
