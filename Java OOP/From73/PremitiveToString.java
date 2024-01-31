
package From73;

public class PremitiveToString {
    public static void main(String[] args) {
        int x = 100;
        String s = Integer.toString(x);
        System.out.println("s = "+s);
        
        double y = 100.25;
        String k = Double.toHexString(y);
        System.out.println("y = "+y);
    }
    
}
