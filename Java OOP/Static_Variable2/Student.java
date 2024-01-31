
package Static_Variable2;


public class Student {
     static int count = 0;//Non-Static Variable
    
    Student(){
        count++;
    }
    void TotalStudent(){
        System.out.println("Total Student = "+count);
    }
}
