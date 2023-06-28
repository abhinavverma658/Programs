public class Inheritance_1 {
    static class  Animal{
        void eat (){
            System.out.println("Eating...");
        }
    }
    static class dog extends Animal{
        void bark(){
            System.out.println("Barking....");
        }
    }

    public static void main(String[] args) {
        dog d = new dog();
        d.bark();
        d.eat();
        System.out.println(" ");
        Animal e = new Animal();
        e.eat();
    }
}
