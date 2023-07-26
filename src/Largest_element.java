import java.util.Scanner;

public class Largest_element {
    static int largest_Element(int[] arr){
        int m=arr[0];
        for(int i=0;i<arr.length;i++){
           m = Math.max(m,arr[i]);
        }
        return m;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter size");
        int[] arr = new int[sc.nextInt()];
        System.out.println("Enter Elements: ");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(largest_Element(arr));
     }
}
