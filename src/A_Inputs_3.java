import java.util.Scanner;

public class A_Inputs_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Marks :-");
        System.out.println("Enter first subject marks:");
        int f_s_m = sc.nextInt();
        System.out.println("Enter Second subject marks:");
        int s_s_m = sc.nextInt();
        System.out.println("Enter third subject marks:");
        int t_s_m = sc.nextInt();
        int total_marks = f_s_m+s_s_m+t_s_m;
        System.out.println("Total marks:"+total_marks);
        System.out.println("Avg Marks: "+total_marks/3);
    }
}
