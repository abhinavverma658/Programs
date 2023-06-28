import java.util.Scanner;

public class Arranging_Array {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int T = scanner.nextInt();
        for (int k=0;k<=T;k++){
            long n = scanner.nextLong();
            long[] arr = new long[(int) n];
            for (int i = 0; i < n; i++) {
                arr[i] = scanner.nextLong();
            }
            if (n % 2 == 1) {
                System.out.println("YES");
                continue;
            }
            for (int i = 1; i < n - 1; i++) {
                arr[i + 1] -= (arr[i] - arr[i - 1]);
                arr[i] = arr[i - 1];
            }
            if (arr[(int) (n - 1)] >= arr[(int) (n - 2)]) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
    }
    }
}
