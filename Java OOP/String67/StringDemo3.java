
package String67;

public class StringDemo3 {
    public static void main(String[] args) {
        String country = " Bangladesh is my country ";
        System.out.println(country);

        char ch = country.charAt(2);
        System.out.println(ch);
        System.out.println();

        int value = country.codePointAt(1);
        System.out.println(value);
        System.out.println();

        int pos = country.indexOf("is");
        System.out.println(pos);
        System.out.println();
        // Code

        pos = country.lastIndexOf("n");
        System.out.println(pos);
        System.out.println();

        String s3 = country.trim();
        System.out.println(s3);

    }
}
