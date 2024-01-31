
package Static_Method;


public class StaticBlock {
    static int id;
    static String name;
    static{
    id = 213002027;
    name = "Rabbi";

    
    }
    static void display(){
        System.out.println("Id = "+id);
        System.out.println("Name = "+name);
    }
    public static void main(String[] args) {
        StaticBlock.display();
    }
}
