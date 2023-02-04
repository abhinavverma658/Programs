import java.util.Scanner;

public class A_Inputs_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String  name = sc.nextLine();
        int roll_no = sc.nextInt();
        String field_of_interest = sc.next();
        System.out.println("Name:"+ name);
        System.out.println("Roll No. :"+ roll_no);
        System.out.println("Field of Interest: "+ field_of_interest);

    }
}
