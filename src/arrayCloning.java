import java.util.Arrays;
import java.util.Scanner;

// Array Cloning
public class arrayCloning {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size of array: ");
        int[] arr = new int[sc.nextInt()];
        System.out.println("Enter elements: ");
        for(int i =0;i<arr.length;i++){
            arr[i]= sc.nextInt();
        }
        int[] arr2 = arr.clone();
        System.out.println("CLONED:");
        for (int i:arr2){
            System.out.print(" "+i);
        }
        System.out.println(" ");
        System.out.println("COPY OF to full length: ");
        int[] arr3 = Arrays.copyOf(arr,arr.length);
        for (int i : arr3){
            System.out.print(" "+i);
        }
        System.out.println(" ");
        System.out.println("COPY OF to length  3:");
        int[] arr4 = Arrays.copyOf(arr, 3 );
        for (int i:arr4){
            System.out.print(" "+i);
        }
        System.out.println(" ");
        System.out.println("COPY OF RANGE from 1 to 4 index: ");
        int[] arr5 = Arrays.copyOfRange(arr,1,4);
        for (int i : arr5){
            System.out.print(" " +i);
        }
        System.out.println(" ");
    }

}
