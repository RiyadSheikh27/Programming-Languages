
package From73;


public class WrapperDemo {
    public static void main(String[] args) {
        //Premitive >- Object
        int x = 10;
        Integer y = Integer.valueOf(x);
        System.out.println(y);
        
        int z = x;//Integer.valueOf  Outboxing
        System.out.println(z);
    }
    
}
