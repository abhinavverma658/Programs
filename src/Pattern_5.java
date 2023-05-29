/*Input: 5
Output:
        *
       ***
      *****
     *******
    *********

 ---------------------------------------------------------------------------------------------------------------
*/
import java.util.Scanner;

public class Pattern_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            // space
            for (int j = 0; j < (n - i - 1); j++) {
                System.out.print(" ");
            }
            //Stars
            for (int k = 0; k < (2 * i + 1); k++) {
                System.out.print("*");
            }
            //Space
            for (int l = 0; l < (n - i - 1); l++) {
                System.out.print("");
            }
            System.out.println();//New Line
        }
        for (int p = 0; p < n; p++) {
            for (int j = 0; j < p; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < (2 * n - (2 * p + 1)); k++) {
                System.out.print("*");
            }
            System.out.println(" ");//New Line
        }
    }
}

