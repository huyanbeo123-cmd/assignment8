import java.util.*;
public class Ex5_Parse_Data_from_a_URL {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        int idx1 = s.indexOf("://");
        if (idx1 == -1) {
            System.out.println("Invalid URL");
            return;
        }
        String p = s.substring(0, idx1);
        int idx2 = s.indexOf("/", idx1 + 3);
        if (idx2 == -1) {
            String d = s.substring(idx1 + 3);
            System.out.println("Protocol: " + p);
            System.out.println("Domain: " + d);
            System.out.println("Path: ");
            return;
        }
        String d = s.substring(idx1 + 3, idx2);
        String pa = s.substring(idx2);

        System.out.println("Protocol: " + p);
        System.out.println("Domain: " + d);
        System.out.println("Path: " + pa);
    }
}
