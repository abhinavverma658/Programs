import java.util.Scanner;

class triangle {
    double  a , base,b, c,h;
    public double area(){ //method 1
        double v = (base * h) / 2;
        return v;
    }
    public double perimeter(){ //method 2
        return (a+b+c);
    }
}

public class Into_OOPS_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        triangle triangle_1 = new triangle();
        System.out.println("Enter Sides for perimeter in cm: ");
        triangle_1.a = sc.nextDouble();
        triangle_1.b = sc.nextDouble();
        triangle_1.c= sc.nextDouble();
        System.out.println("Enter base and height for area in cm: ");
        triangle_1.base=sc.nextDouble();
        triangle_1.h= sc.nextDouble();
        System.out.println("AREA: "+triangle_1.area()+ " cm^2");
        System.out.println("Perimeter: "+triangle_1.perimeter());



    }
}
