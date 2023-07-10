// Array References
import org.jetbrains.annotations.NotNull;

import java.util.Scanner;

public class arrayReferences2 {

    static  void arrReference(int @NotNull [] arr){
        for(int i=0;i<arr.length;i++){
            arr[i]=0;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of an array: ");
        int[] arr1 = new int[sc.nextInt()];//This will get the size of array from user.
        System.out.println("Enter Elements");
        for(int i =0;i<arr1.length;i++){
            arr1[i] = sc.nextInt();
            //This will get elements from user;
        }
        arrReference(arr1);//calling arrReference method which changes element into 0. It is allowed in case of array.

        for (int j=0;j<arr1.length;j++){
            System.out.print(" "+arr1[j]);
        }
        System.out.println(" ");
    }
}
