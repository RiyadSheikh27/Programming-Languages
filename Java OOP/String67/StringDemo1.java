package String67;

public class StringDemo1 {

    public static void main(String[] args) {
        String s1 = "fazle Rabbi";
        String s2 = new String("Fazle Rabbi");

        System.out.println("S1 = " +s1);
        System.out.println("s2 = " +s2);

        int len = s1.length();
        System.out.println("Lenth of S1 = " + len);

        boolean con = s1.contains("fazle");
        System.out.println(con);
        boolean b = s1.isEmpty();
        System.out.println(b);

        if (s1.equals(s2)) {
            System.out.println("Equals");
        } else {
            System.out.println("Not Equals");

            if (s1.equalsIgnoreCase(s2)) {
                System.out.println("Equals");
            } else {
                System.out.println("Not Equals");

            }
        }
    }

}
