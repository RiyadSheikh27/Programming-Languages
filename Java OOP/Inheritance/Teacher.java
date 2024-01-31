
package Inheritance;


public class Teacher extends Person {
    /*person class er shb ekhane chole ashbe..
    Shathe chaile kichu add korte parbo */
    String qualification;
    void displayInformation2(){
        displayInformation1();
        System.out.println("Qualification = "+qualification);
    }
}
