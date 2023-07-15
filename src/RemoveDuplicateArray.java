import java.util.Scanner;

public class RemoveDuplicateArray {
    static int removeElements(int[] nums){
        int i=0;
            for(int j=1;j<nums.length;j++)
            {
                if(nums[i]!=nums[j])
                {
                    nums[i+1]=nums[j];
                    i++;
                }
            }
        return i+1;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int[] nums = new int[10];
        for(int i=0;i<nums.length;i++){
            nums[i]= sc.nextInt();
        }
        System.out.println(removeElements(nums));
    }
}
