
package From73;

public class BinaryHexaOctalToDecimal {
    public static void main(String[] args) {
        String binary = "1010";
        String octal = "675";
        
        Integer decimal = Integer.parseInt(octal, 2);
        System.out.println(decimal);
        
    }
    
}
