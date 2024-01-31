
package String67;


public class PalindromeDemo {
    public static void main(String[] args) {
        String sb1 = "Rabbi";
        StringBuffer sb = new StringBuffer(sb1);
        String sb2 = sb.reverse().toString();
        
       if(sb1.equals(sb2)){
           System.out.println("Palindome");
       }else{
           System.out.println("Not Palindrome");
       }
    }
}
