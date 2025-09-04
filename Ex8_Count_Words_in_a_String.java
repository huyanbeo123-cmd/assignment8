import java.util.*;
public class Ex8_Count_Words_in_a_String {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String[] arr = s.trim().split("\\s+");
        System.out.println("The number of words in the string is: " + arr.length);
    }
}
