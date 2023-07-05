//Check if all elements all are sorted is sorted or not in an array.
import org.jetbrains.annotations.Contract;
import java.util.Scanner;

public class gfgQuestionArray_3 {
    @Contract(pure = true)
    static int sorted(int[] arr){
        int i;
        for(i=1;i<arr.length;i++){
            if(arr[i]>=arr[i-1]){
            }
            else{
                return 0;
            }
        }
        return 1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter total no of elements: ");
        int[] arr = new int[sc.nextInt()];
        int i;
        for(i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(sorted(arr));
    }
}
