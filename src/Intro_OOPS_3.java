/*
Q3. Write a program to print the area of a rectangle by creating a class named 'Area' taking the values
of its length and breadth as parameters of its constructor and having a method named 'returnArea'
which returns the area of the rectangle. Length and breadth of rectangle are entered through keyboard.
 */
import java.util.Scanner;

public class Intro_OOPS_3 {
    static class Area{
        public int returnArea(int length, int breadth){
            return (length*breadth);
        }

        public static void main(String[] args) {
            Scanner sc= new Scanner(System.in);
            Area recArea = new Area();
            System.out.println("Area: "+recArea.returnArea(sc.nextInt(), sc.nextInt()));

        }
    }
}
