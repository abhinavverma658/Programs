//-> Write a Java method to compute the average of three numbers

import java.util.Scanner;
class average{
   public int avg(int a , int b,int c){
       return (a+b+c)/3;
    }

        }
public class A_JM_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        average avg1 = new average();
        System.out.println("AVERAGE->");
        System.out.println("Enter no. in order ->   1st no."+"\n"+"\t"+"\t"+"\t"+"\t"+"\t"+"\t"+"2nd .no"+"\n"+ "\t"+"\t"+"\t"+"\t"+"\t"+"\t"+"3rd no.");
        System.out.println("Avg. of three no.'s: "+avg1.avg(sc.nextInt(), sc.nextInt(), sc.nextInt()));
    }

}
