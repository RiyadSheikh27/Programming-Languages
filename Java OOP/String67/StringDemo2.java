package String67;

public class StringDemo2 {

    public static void main(String[] args) {
        String firstname = "Fazle";
        String lastname = " Rabbi";

        String fullname = firstname + lastname;
        System.out.println("First Way to Prunt Full name = " + fullname);
        System.out.println();

        String Fullname = firstname.concat(lastname);
        System.out.println("Another Way to Print Full name = " + Fullname);
        System.out.println();
        
            
        boolean b = firstname.startsWith("Fa");
        System.out.println("b = "+b);
        System.out.println();
        
        boolean last = lastname.endsWith("biiii");
        System.out.println("last = "+last);
        System.out.println();

        String upperName = fullname.toUpperCase();
        System.out.println(upperName);
        System.out.println();

        String lowerName = fullname.toLowerCase();
        System.out.println(lowerName);
        System.out.println();
        
        String[] names = {"Rabbi,Rokon Noman,Rakib"};
        for(String x : names){
            System.out.println(x);
        }
    
    }
}
