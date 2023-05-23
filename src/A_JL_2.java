
import java.util.Scanner;

public class A_JL_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=0;
        System.out.println("Enter how many times loop will execute: ");
        int x = sc.nextInt();

        for (int i = 1; i<=x ; i++) {
            if(n>0){
                n = sc.nextInt();
                n = n + n;
                System.out.println(n);
            }
            else {
                System.out.println("-1");
                break;
            }
        }
    }
}
