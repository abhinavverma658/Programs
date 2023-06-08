import java.util.Scanner;
public class A_JM_5 {
    public static int smallestNumber(int a, int b ,int c){
       return Math.min(a,Math.min(b,c));/* Math.min method will calculate minimum valve by itself.*/

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter numbers : ");
        System.out.println("Smallest Number --> "+smallestNumber(sc.nextInt(), sc.nextInt(), sc.nextInt()));
    }
}
