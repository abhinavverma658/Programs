import java.util.Scanner;

public class LinearSearch {
   static int linearSearch(int [] arr, int num){
        int i=0;
        for(i=0;i<arr.length;i++){
            if(num==arr[i]){
                return i;
            }
        }
        return -1;
   }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr= new int[sc.nextInt()];
        for (int i=0;i<arr.length;i++){
            arr[i]= sc.nextInt();
        }
        int num= sc.nextInt();
        System.out.println(linearSearch(arr,num));
    }
}
