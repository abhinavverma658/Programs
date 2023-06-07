import java.util.Scanner;

class Employee{
        String name;
        int yearOfJoining;
        int salary;
        String address;

        }
public class Intro_OOPS_5 {
        public static void main(String[] args) {
                Scanner sc= new Scanner(System.in);
                Employee emp1=new Employee();
                System.out.println("Enter emp1 details in order --> name , YOJ ,salary, address");
                emp1.name=sc.nextLine();
                emp1.yearOfJoining=sc.nextInt();
                emp1.salary= sc.nextInt();
                emp1.address= sc.next();
                Employee emp2 = new Employee();
                System.out.println("Enter emp2 details in order --> name , YOJ ,salary, address");
                emp2.name= sc.next();
                emp2.yearOfJoining= sc.nextInt();
                emp2.salary=sc.nextInt();
                emp2.address= sc.next();
                System.out.println(" Name "+" Year of Joining" +" Salary "+" Address ");
                System.out.println(emp1.name +"\t"+ emp1.yearOfJoining+"\t" + emp1.salary+"\t" +emp1.address);
                System.out.println(emp2.name +"\t"+ emp2.yearOfJoining +"\t"+ emp2.salary +"\t"+emp2.address);
        }
}
