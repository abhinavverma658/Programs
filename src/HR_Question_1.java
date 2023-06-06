import java.util.Scanner;

public class HR_Question_1 {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int b= sc.nextInt();
            int h= sc.nextInt();
//            if(b<0||h<0){
//                throw new RuntimeException("Breadth and height must be +ve.");
//            }
//            else {
//                int area = b * h;
//                System.out.println("AREA: "+area);
//            }
        if(b<0||h<0){

        }
        else {
            int area = b * h;
            System.out.println("AREA: "+area);
        }
    }
}
