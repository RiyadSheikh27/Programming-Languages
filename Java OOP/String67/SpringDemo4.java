
package String67;

public class SpringDemo4 {
    public static void main(String[] args) {
        String s1 = "This is my country";
        String s2 = s1.replace('i','j');
        System.out.println(s2);
        
        
        //Split dile jeta shoranor dorkar sheta shorano jabe
        String[] s3 = s1.split(" ");
        for(String x : s3){
            System.out.println(x);
        }
        
    }
    
}
