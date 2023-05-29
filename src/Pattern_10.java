/*
Input: 5

Output:

1                 1
1 2             2 1
1 2 3         3 2 1
1 2 3 4     4 3 2 1
1 2 3 4 5 5 4 3 2 1
 */
import java.util.Scanner;

public class Pattern_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int space=2*(n-1);
        for(int i=1;i<=n;i++){
            //Number
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            //Space
            for(int k=1;k<=(space);k++){
                System.out.print(" ");
            }
            //Number
            for(int l=i;l>=1;l--){
                System.out.print(l);
            }
            System.out.println();
            space=space-2;
        }
    }
}
