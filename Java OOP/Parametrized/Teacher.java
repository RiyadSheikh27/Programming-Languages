
package Parametrized;

public class Teacher {
    String name,gender;
    int age;
    
    void setInformation(String n, String g , int a){
        name = n;
        gender= g;
        age = a;
    }
    void display(){
        System.out.println("Teacher name is "+name);
        System.out.println("Teacher age is "+age);
        System.out.println("Teacher gender is "+gender);
        System.out.println("");
    }
}
