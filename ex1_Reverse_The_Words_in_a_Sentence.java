import java.util.Scanner;
public class ex1_Reverse_The_Words_in_a_Sentence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input your sentences: ");
        String s = scanner.nextLine();
        String[] arr = s.split(" ");
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
    }
}
