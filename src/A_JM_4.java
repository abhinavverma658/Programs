//Write a Java method to check whether a year (integer) entered by the user is a leap year or not.
import java.util.Scanner;

public class A_JM_4 {
    static int leapYear(int a){
        int ans=(a%4);
        if(ans==0){
            System.out.println("Leap year");
        }
        else{
            System.out.println("Not a leap year");
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        leapYear(sc.nextInt());
    }
}
