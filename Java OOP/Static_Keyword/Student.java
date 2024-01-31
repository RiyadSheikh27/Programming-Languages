
package Static_Keyword;

public class Student {
    String name;
    int id;
    static String universityname = "Green University of Bangladesh";
    Student(String n,int i){
        name = n;
        id = i;
        
    }
void displayinformation(){
    System.out.println("Name = "+name);
    System.out.println("Id = "+id);
    System.out.println("University Name = "+universityname);

}

}
