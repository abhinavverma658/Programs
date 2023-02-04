import java.util.Scanner;

public class A_Inputs_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Word: ");
        String first_word = sc.next();
        System.out.println("Enter Second Word: ");
        String second_word = sc.next();
        System.out.println("concatenated Word:" + first_word+second_word);
    }
}
