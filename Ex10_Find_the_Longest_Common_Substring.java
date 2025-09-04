import java.util.*;
public class Ex10_Find_the_Longest_Common_Substring {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s1 = scanner.nextLine();
        String s2 = scanner.nextLine();

        String a = s1.length() < s2.length() ? s1 : s2;
        String b = s1.length() < s2.length() ? s2 : s1;

        String longest = "";
        for (int i = 0; i < a.length(); i++) {
            for (int j = i + 1; j <= a.length(); j++) {
                String sub = a.substring(i, j);
                if (b.contains(sub) && sub.length() > longest.length()) {
                    longest = sub;
                }
            }
        }

        System.out.println(longest);
    }
}
