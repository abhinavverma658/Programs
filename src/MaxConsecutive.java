
import java.util.Scanner;

public class MaxConsecutive {
    static int max(int[] arr){
        int count=0;
        int maxi=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==1){
                count++;
            }
            else{
                count=0;
            }
            maxi=Math.max(maxi,count);
        }
        return maxi;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size: ");
        int[] arr = new int[sc.nextInt()];
        System.out.println("Enter binary in array: ");
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(max(arr));

    }
}
