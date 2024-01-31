
package beginnerjava;

public class MathDemo {
    public static void main(String[] args) {
        int a = 2;
        int b = 3;
        int max = Math.max(a, b);
        
        System.out.println("Maximum = "+max);
        
        int min;
        min = Math.min(a, b);
        System.out.println("Minimum = "+min);
        
        int absolute;
        absolute = Math.abs(a);
        System.out.println("Absolute of a = "+absolute);
        
        Double power;
        power = Math.pow(a, b);
        System.out.println("x to the power y = "+power);
        
        int round = Math.round(8.8f);
        System.out.println("Round of 8.8 = "+round);
        
        double pi = Math.PI;
        System.out.println("PI = "+pi);
    }
        
    
}
