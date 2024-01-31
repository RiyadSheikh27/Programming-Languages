
package problem_solving2;

public class Circle extends Shape{
      Circle(double val1, double val2){
        super(val1,val2);
    }
     
      void area(){
          double result = val1*val2;
          System.out.println(""+result);
      }
}
