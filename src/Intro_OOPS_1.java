import java.util.Scanner;
public class Intro_OOPS_1 {
    public static void main(String[] args) {
        Student person_1 = new Student();
        teachers person = new teachers();
        System.out.println(person_1.name);
        System.out.println(person_1.roll_no);
        System.out.println(person.teacher_name);
        System.out.println(person.id_no);
    }
}
class Student {
    Scanner sc = new Scanner(System.in);
    String name = sc.nextLine();
    int roll_no = sc.nextInt();
}
class teachers{
    Scanner scn = new Scanner(System.in);
    String teacher_name = scn.nextLine();
    int id_no = scn.nextInt();
}
