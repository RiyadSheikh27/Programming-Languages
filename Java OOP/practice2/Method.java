package practice2;

public class Method {
    int x;
//Method
    static void riyad1() {
        System.out.print("Hey, This is Riyad Here.");
    }

    static void riyad2() {
        System.out.print("I am doing B.sc in Cse from GUB.");
    }

    static void riyad3() {
        System.out.print("This is my 6th Semester.");
    }

    static void age(int a) {
        System.out.print("I am " + a + " years old.");
    }
//Method Overloading
    static void age(String a) {
        System.out.print("I am " + a + " years old.");
    }

    public static void main(String[] args) {
        riyad1();
        riyad2();
        riyad3();
        age(23);
        age("tweenty three");
        //Objects
        Method obj = new Method();
        obj.x = 20;
        System.out.println("The value is " + obj.x);

    }
}
