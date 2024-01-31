
package Lab_problem_solving_inheritance;

public class Test {
    public static void main(String[] args) {
        
      FireEmergency myArray[] = new FireEmergency[4];
      
      myArray[0] = new FireEmergency();
      myArray[1] = new FireEmergency();
      myArray[2] = new SmokeAlarm();
      myArray[3] = new SmokeAlarm();
      
      
      for(int i=0;i<=3;i++){
        myArray[i].soundSiren();
    }
        
    }
}
