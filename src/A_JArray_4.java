//Calculate the minimum element in the array {2, -3, 5, 8, 1, 0, -4} using standard library method for calculating the minimum element.
public class A_JArray_4 {
    public static void main(String[] args) {
        int arr[] = {2, -3, 5, 8, 1, 0, -4};
        int min=arr[0];
        for(int i=0;i<arr.length;i++){
           min= Math.max(min,arr[i]);
        }
        System.out.println(min);
    }
}
