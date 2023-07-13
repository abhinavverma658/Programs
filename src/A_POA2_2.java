import java.util.Scanner;

public class A_POA2_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size of array: ");
        int[] arr = new  int[sc.nextInt()];
        System.out.println("Enter elements: ");
        for(int i: arr){
            arr[i]= sc.nextInt();
        }
        System.out.println("Enter value: ");
        int x = sc.nextInt();
        int count =0;
        for(int i = 0;i<arr.length;i++){
            if (arr[i]==x){
                count++;
            }
        }
        System.out.println(count);

    }
}
