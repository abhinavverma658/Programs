//Q2 - Swap two numbers without the use of third variable.
import java.util.Scanner;

public class A_JO_2
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st number: ");
        int x = sc.nextInt();
        System.out.println("Enter 2nd number: ");
        int y = sc.nextInt();
        x=x+y;
        y=x-y;
        x=x-y;
        System.out.println("Swaped No. -> "+ "First no.: " +x + " Second no.: " +y);

    }
}
