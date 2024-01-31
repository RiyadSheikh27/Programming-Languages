
package problem_solving2;

public class Rectangle extends Shape{
    Rectangle(double r){
        super(r,r);
    }
     
      void area(){
          double result = Math.PI*val1*val2;
          System.out.println(""+result);
      }
}
