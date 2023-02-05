import java.util.Scanner;

public class A_Inputs_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i;
        int t = sc.nextInt();
        for(i=1;i<=t;i++){
            String first_word = sc.next();
            String last_word = sc.next();
            String sum = first_word+last_word;
            System.out.println("Concatenated Value: "+sum);

        }
    }
}
