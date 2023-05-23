/*- Write a program to add 8 to the number x and then divide it by 3. Now, the modulus of the quotient
is taken with 5 and then multiply the resultant value by 5. Display the final result.*/
import java.util.Scanner;

public class A_JO_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        x += 8;
        x /= 3;
        x %= 5;
        x *= 5;
        System.out.println(x);
    }
}
