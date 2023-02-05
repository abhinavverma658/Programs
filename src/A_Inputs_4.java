import java.util.Scanner;

public class A_Inputs_4 {
    public static void main(String[] args) {
        int i;
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(i=1;i<=t;i++){
            System.out.println("Enter value of a: ");
            int a = sc.nextInt();
            System.out.println("Enter value of b: ");
            int b = sc.nextInt();
            int z= a+b;
            System.out.println("Sum Value: "+z);

        }
    }
}
