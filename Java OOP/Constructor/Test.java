
package Constructor;

public class Test {
    public static void main(String[] args) {
        Teacher t1 = new Teacher("Riyad", "Male", 20);
        t1.display();
        
        Teacher t2 = new Teacher("Roshni", "Female");
        t2.display();
        
        Teacher t3 = new Teacher();
        
    }
}
