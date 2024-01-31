
package StaticKeyword;

public class Teacher {
    String name;
    int id;
    static String uvName ="GUB";
    
    Teacher(String n, int i){
        name = n;
        id = i;
    }
    
    void display(){
        System.out.println("Teacher name is = "+name);
        System.out.println("Teacher id is = "+id);
        System.out.println("Teacher university name is = "+uvName);
    }
}
