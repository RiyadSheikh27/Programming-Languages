
package String67;
public class StringBuilderDemo {
    public static void main(String[] args) {
        
        StringBuilder str = new StringBuilder("Fazle");
          str.append(" Rabbi");
          System.out.println(str);
          
          str.reverse();
          System.out.println(str);
          
          str.delete(0, 3);
          System.out.println(str);
    }
    
}
