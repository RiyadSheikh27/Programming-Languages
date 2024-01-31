
package Encapsulation;

public class Test {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.setName("Rabbi");
        p1.setAge(27);
        System.out.println("Name = "+p1.getName());
        System.out.println("Name = "+p1.getAge());
    }
}
