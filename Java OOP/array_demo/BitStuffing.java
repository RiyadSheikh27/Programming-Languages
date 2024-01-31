import java.util.Scanner;

public class BitStuffing {
    public static void main(String[] args) {
        int i = 0, j = 0;
        char[] d = new char[100];
        char[] l = " FLETX".toCharArray();
        char[] sd = new char[100];
        char[] ds = new char[100];

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Data in UpperCase: ");
        String inputData = scanner.next();
        d = inputData.toCharArray();

        sd[0] = 'F';
        sd[1] = 'L';
        sd[2] = 'S';
        sd[3] = 'T';
        sd[4] = 'X';
        sd[5] = ' ';
        j = 6;

        while (d[i] != '\0') {
            if (d[i] == 'E' && d[i + 1] == 'S' && d[i + 2] == 'C') {
                sd[j] = 'E';
                sd[j + 1] = 'S';
                sd[j + 2] = 'C';
                sd[j + 3] = 'E';
                sd[j + 4] = 'S';
                sd[j + 5] = 'C';
                j += 6;
                i += 3;
            } else {
                sd[j++] = d[i++];
            }
        }
        sd[j] = '\0';

        System.arraycopy(sd, 0, ds, 0, sd.length);

        for (char c : l) {
            ds[j++] = c;
        }

        System.out.print("After Stuffing: ");
        System.out.print(ds);

        i = 0;
        j = 6;

        while (ds[j] != '\0') {
            if (ds[j] == 'E' && ds[j + 1] == 'S' && ds[j + 2] == 'C' && ds[j + 3] == 'E' && ds[j + 4] == 'S' && ds[j + 5] == 'C') {
                d[i] = 'E';
                d[i + 1] = 'S';
                d[i + 2] = 'C';
                j += 6;
                i += 3;
            } else {
                d[i++] = ds[j++];
            }
        }
        d[i] = '\0';

        System.out.println("\n\nAfter De-stuffing: " + new String(d));
    }
}
