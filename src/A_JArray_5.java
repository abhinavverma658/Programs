public class A_JArray_5 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8};
        for(int i=1;i< arr.length;i++){
            if(arr[i-1]>=arr[i]&&arr[i]>=arr[i+1]){
                System.out.println(arr[i]);
            }
        }
    }
}
