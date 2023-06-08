//- Write a Java method to count all vowels in a string
import java.util.Scanner;

class count {
    public int countVariable(String s){
        int count =0;
        for(int i=0;i<s.length();i++){//for loop will go on till strings length
            char ch = s.charAt(i);//charAt method will scan characters of strings.
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
                count++;//if any of condition gets true then count will increase by 1.
            }
        }
        return count;
    }
}
public class A_JM_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String --> ");
        count count1 = new count();
        System.out.println("Vowels count -> "+count1.countVariable(sc.nextLine()));

    }
}
