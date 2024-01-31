
package Basic;
public class Teacher {
  
    String name,gender,email;
    int age,number;
    
    
    void display(){
    
        System.out.println("Teacher name is "+name);
        System.out.println("Teacher age is "+age);
        System.out.println("Teacher mail is "+email);
        System.out.println("Teacher number is "+number);
        System.out.println("Teacher gender is "+gender);
        System.out.println("");
    }
    
    
    
    
    
    public static void main(String[] args) {
        
        Teacher Teacher1 =new Teacher();
        Teacher Teacher2 =new Teacher();
        Teacher Teacher3 =new Teacher();
        
        
        Teacher1.name = "Tuhin Sir";
        Teacher1.age = 23;
        Teacher1.email = "tuhin@gmail.com";
        Teacher1.gender = "Female";
        Teacher1.number = 13078213;
        Teacher1.display();
        
        Teacher2.name = "Akash Sir";
        Teacher2.age = 23;
        Teacher2.email = "tuhin@gmail.com";
        Teacher2.gender = "Female";
        Teacher2.number = 13078213;
        Teacher2.display();
        
        Teacher3.name = "Roshni Sir";
        Teacher3.age = 23;
        Teacher3.email = "tuhin@gmail.com";
        Teacher3.gender = "Female";
        Teacher3.number = 13078213;
        Teacher3.display();
        
        
     
    }
       
    }
    
    
    

