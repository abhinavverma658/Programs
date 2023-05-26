//Write a program to calculate the factorial of a number
import java.util.Scanner;

public class A_JL_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter factorial to calculate: ");
        int x = sc.nextInt();
        int n = 1;
        for(int i = 1 ; i<=x;i++){
            n=n*i;
            System.out.println(n);
        }
    }
}
