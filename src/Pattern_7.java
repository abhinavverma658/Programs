/*
Input: 5

Expected Output:

            *
           * *
          * * *
         * * * *
        * * * * *
        * * * * *
         * * * *
          * * *
           * *
            *

 */
import java.util.Scanner;

public class Pattern_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        for (int i = 1; i<=n; i++) {
            // space
            for (int j = 1; j <=(n-i); j++) {
                System.out.print(" ");
            }
            //Stars
            for (int k = 1; k <= i; k++) {
                System.out.print("* ");
            }
            //Space
            for (int l = 1; l <= (n-i); l++) {
                System.out.print(" ");
            }
            System.out.println();//New Line
        }
        for (int p = 1; p <= n; p++) {
            for (int j = 2; j <= p ; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k <= (n-p); k++) {
                System.out.print("* ");
            }
            System.out.println("");//New Line
        }
    }
}
