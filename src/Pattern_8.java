import java.util.Scanner;

public class Pattern_8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        for (int i=0;i<=n;i++) {
            for (int j = 0; j<=i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
     for(int l=0;l<=n;l++){
            for(int m=n;m>l;m--){
              System.out.print("* ");
          }
            System.out.println();

     }
    }
}
