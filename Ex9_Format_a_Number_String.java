import java.util.*;
public class Ex9_Format_a_Number_String {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        StringBuilder r = new StringBuilder(s);
        for (int i = r.length() - 3; i > 0; i -= 3) {
            r.insert(i, ",");
        }
        System.out.println(r.toString());
    }
}
