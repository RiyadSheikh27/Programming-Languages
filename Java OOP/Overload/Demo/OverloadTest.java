
package Overload.Demo;

public class OverloadTest {
    public static void main(String[] args) {
        Overload ob = new Overload();
        ob.add();
        ob.add(10,20);
        ob.add(10.0,20.0);
        ob.add(10,20,30);
 
}
}