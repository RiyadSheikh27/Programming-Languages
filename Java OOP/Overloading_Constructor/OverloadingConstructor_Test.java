
package Overloading_Constructor;


public class OverloadingConstructor_Test {
    public static void main(String[] args) {
        Teacher teacher1 = new Teacher();
        Teacher teacher2 = new Teacher("Rabbi","Male");
        teacher2.displayInformation();
        Teacher teacher3 = new Teacher("Riyad","Male",1307813956);
        teacher3.displayInformation();
    }
    
}
