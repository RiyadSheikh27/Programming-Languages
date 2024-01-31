
package DateDemo;

import java.util.Random;

public class RandomDemo {
    public static void main(String[] args) {
        Random rand = new Random();
        int randomNumber = rand.nextInt(10) + 1;
        System.out.println("Random Number = "+randomNumber);
    }
    
}
