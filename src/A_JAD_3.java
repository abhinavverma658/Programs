import java.util.Scanner;

public class A_JAD_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Length: ");
        int length = sc.nextInt();
        System.out.println("Enter Breadth: ");
        int breadth = sc.nextInt();
        int area = length*breadth;
        System.out.println("AREA = "+area);

    }
}
