import java.util.Scanner;

public class A_JAD_5 {
    public static void main(String[] args) {
        int temp;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of x: ");
        int x = sc.nextInt();
        System.out.println("Enter value of y: ");
        int y = sc.nextInt();
        temp = x;
        x =y;
        y= temp;
        System.out.println("Current value of x: "+x);
        System.out.println("Current value of y: "+y);


    }
}
