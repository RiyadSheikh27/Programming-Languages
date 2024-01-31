
package Method_Overriding;

public class test {
    public static void main(String[] args) {
        teacher t1 = new teacher();
        t1.age = 21;
        t1.gender = "Male";
        t1.name = "Riyad";
        t1.display();
        
        person t2 = new person();
        t2.age = 22;
        t2.name = "Rabbi";
        t2.display();
        
        
     
    }
  
}
