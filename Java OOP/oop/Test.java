
package oop;

public class Test {
    public static void main(String[] args) {
        Teacher teacher1 = new Teacher();
        teacher1.gender = "Male";
        teacher1.name = "Fazle Rabbi";
        teacher1.number = 1307813956;
        System.out.println("Details of First Teacher");
        System.out.println("Gender = "+teacher1.gender);
        System.out.println("Name= "+teacher1.name);
        System.out.println("Number = "+teacher1.number);
        System.out.println();
        
        Teacher teacher2 = new Teacher();
        teacher2.gender = "Female";
        teacher2.name = "Anika";
        teacher2.number = 1829415010;
        
        System.out.println("Details of Second Teacher");
        System.out.println("Gender = "+teacher2.gender);
        System.out.println("Name= "+teacher2.name);
        System.out.println("Number = "+teacher2.number);
        System.out.println();
        
        Teacher teacher3 = new Teacher();
        teacher3.gender = "Male";
        teacher3.name = "Abir Sheikh";
        teacher3.number = 1612168868;
        
        System.out.println("Details of Third Teacher");
        System.out.println("Gender = "+teacher3.gender);
        System.out.println("Name= "+teacher3.name);
        System.out.println("Number = "+teacher3.number);
        
    }
    
}
