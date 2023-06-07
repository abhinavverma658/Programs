import java.util.Scanner;

public class Count_Digits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        for (int i=1;i<n;i++){
           int ans= n%10;
            n = n / 10;
            System.out.println(ans);
            System.out.println(n);
        }
    }
}
