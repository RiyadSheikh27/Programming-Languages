
package Inheritance;

public class Test {
    public static void main(String[] args) {
        Teacher t1 = new Teacher();
        t1.name = "Rabbi";
        t1.age = 27;
        t1.qualification = "Bsc in Cse";
        t1.displayInformation2();
        
        System.out.println();
        
        Teacher t2 = new Teacher();
        t1.name = "Noman";
        t1.age = 25;
        t1.qualification = "Bsc in EEE";
        t1.displayInformation2();
    }
}
