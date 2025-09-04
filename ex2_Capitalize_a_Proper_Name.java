import java.util.Scanner;

public class ex2_Capitalize_a_Proper_Name {
    public static void main(String[]args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Input your name: ");
        String s= scanner.nextLine();
        String[] word = s.trim().split("\\s+");
        StringBuilder result = new StringBuilder();
        for(int i=0;i< word.length;i++){
            word[i]=word[i].substring(0,1).toUpperCase()+word[i].substring(1).toLowerCase();
            System.out.print(" "+word[i]);
        }
    }
}
