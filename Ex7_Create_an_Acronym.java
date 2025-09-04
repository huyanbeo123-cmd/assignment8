import java.util.*;
public class Ex7_Create_an_Acronym {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String[] arr = s.trim().split("\\s+");

        StringBuilder r = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            r.append(Character.toUpperCase(arr[i].charAt(0)));
        }

        System.out.println(r.toString());
    }
}
