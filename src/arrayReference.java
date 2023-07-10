// Array references in JAVA
import java.util.Scanner;

public class arrayReference {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        int [] arrNew = { 1,4,5,6,1,3};
        System.out.print("Enter elements: ");
        for(int i=0;i<arr.length;i++){
            arr[i]= sc.nextInt();
        }
        int[] arr2 = arr;
        System.out.println("Stored element in arr2 : ");
        for (int i : arr2) {
            System.out.print(" "+ i);
        }
        System.out.println(" ");
        arr2[0]= 0;// Changing elements of arr2 but arr will also get changed
        arr2[1] =0;
        System.out.println("Printing elements after changing :");
        for (int i : arr2) {
            System.out.print(" "+i);
        }
        System.out.println(" ");
        // THIS IS CALLED SHALLOW COPY because we are coping references not allocating a new memory.
        System.out.println("checking if arr gets changed: ");
        for (int i : arr) {
            System.out.print(" "+ i);
            // element of arr also get changed as we changed arr2.
            /*
            Because in memory stack arr2 stores address of arr
            when arr2 is changing it gets changed arr elements as arr2 is storing address of arr.
             */
        }
        System.out.println(" ");
        // THIS IS CALLED DEEP COPY because in this we are coping elements in new and different memory.
        int [] arr_3 = arrNew.clone();//This clone function will create a new memory for arr_3 in that all will get stored.
        System.out.println("Checking clone function: ");
        for(int i: arr_3){
            System.out.print(" "+i);
        }
        System.out.println(" ");


}
}

