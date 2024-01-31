
package String67;

public class StringBufferDemo {
     public static void main(String[] args) {
         
         //String s1 = "Rabbi"; evabe o use korte pari
        StringBuffer sb = new StringBuffer("Rabbi");
         System.out.println("Fazle");
         
         sb.append(" Rabbi");
         sb.append("55");
         System.out.println(sb);
         
         sb.reverse();
         System.out.println(sb);
         
         sb.delete(0, 5);
         System.out.println(sb);
         
         sb.setLength(5);
         System.out.println(sb);
         
         
        
    }
    
    
}
