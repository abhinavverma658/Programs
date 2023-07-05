import java.util.Scanner;
public class gfgQuestionArray_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter total no. of elements: ");
        int[] arr = new int[sc.nextInt()];
        int i;
        for( i=0;i<arr.length;i++) {//for taking inputs from user
            arr[i] = sc.nextInt();
        }
        int max = arr[0];
        for (int k : arr) { // This loop is for finding maximum value in an array using for each loop;
            max = Math.max(max, k);
        }
        System.out.println("Largest element is: "+max);
        int s_largest = Integer.MIN_VALUE; // This -> Interger.MIN_VALUE is used  because if array get -ve number. By comparing that number with random lowest number will give an answer.
        System.out.println("s_largest earlier:"+s_largest);
        for(i=0;i< arr.length;i++) //This loop is used for comparing s_largest and comparing with a max value to confirm that its largest element or not.
        {
            if(arr[i]>s_largest&&arr[i]!=max){
                s_largest=arr[i];
            }
        }
        System.out.println("s_largest After: "+ s_largest);
    }
}