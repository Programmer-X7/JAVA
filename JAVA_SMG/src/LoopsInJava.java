public class LoopsInJava {
    public static void main(String[] args) {
        // Q: Sum of first n natural numbers
        
        int n = 6;
        int s = 0;

        // Using for loop
        for(int i=0;i<n;i++){
            s = s + i;
        }
        System.out.println("The Sum is : " + s);


    // Using Whilw loop
        // int i = 0;
    //     while(i<n){
    //         s = s + i;
    //         i++;
    // }
    //     System.out.println("The Sum is : " + s);

    // Using do-while loop
        // int j = 0;
        // do{
        //     s = s + j;
        //     j++;
        // }while(j<n);

        // System.out.println("The sum is : " + s);
    }
}
