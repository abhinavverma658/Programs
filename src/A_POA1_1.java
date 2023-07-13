/*Given an array sorted in increasing order of size n and an integer x, find if there exists a
        pair in the array whose absolute difference is exactly x.(n>1)*/
import java.util.Scanner;
public class A_POA1_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size of an array: ");
        int[] arr = new int[sc.nextInt()];
        System.out.println("Enter Elements in array: ");
        for(int i=0;i<arr.length;i++){
            arr[i]= sc.nextInt();
        }
        System.out.println("Enter difference ");
        int x = sc.nextInt();
        for(int i = 0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if((arr[j]-arr[i])==x){
                    System.out.println("Answer: Yes");
                    return;
                }
            }
        }
        System.out.println("Answer: No");
    }
}
