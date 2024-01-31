
package From73;

public class StringToPremitive {
    public static void main(String[] args) {
          String s = "100";
           
          int i = Integer.parseInt(s);
          System.out.println("i = "+i);
          
          double j = Double.parseDouble(s);
          System.out.println("j = "+j);
          
          int k = Integer.valueOf(s);
          System.out.println("k = "+k);
          
    }
    
}
