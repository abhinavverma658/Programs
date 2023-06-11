//Q1. Given an array of integers {2, 6, -5, -1, 0, 4, -9}, print only the positive values present in the array.
import java.util.Scanner;

public class A_JArray_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter integers in array: ");
        int n[]=new int[5];
        for(int j=0;j<n.length;j++){
            n[j]=sc.nextInt();
        }
        System.out.print("Positive Integers: ");
        for(int i=0;i<n.length;i++) {
            if (n[i] >= 0) {
                System.out.println(n[i]);
            }
        }
    }
}
