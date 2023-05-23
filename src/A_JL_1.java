/* Write a program to print fibonaacci series of n terms where n is input by user*/
import java.util.Scanner;

public class A_JL_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int a=0;
        int b=1;
        for(int i = 1; i<=x;i++){
          int c = a+b;
          a=b;
          b=c;
            System.out.print( c+" ");
        }
    }

}

