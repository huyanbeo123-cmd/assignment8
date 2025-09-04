import java.util.*;
public class Ex4_Check_for_Anagrams {
    public static void main(String []args){
        Scanner scanner=new Scanner(System.in);
        String s1= scanner.nextLine();
        String s2= scanner.nextLine();
        char[] s_1=s1.toCharArray();
        char[] s_2=s2.toCharArray();
        Arrays.sort(s_1);
        Arrays.sort(s_2);
        if (s_1.length!=s_2.length){
            System.out.println("The two strings are not Anagrams. ");
            return;
        }

        else {
            for(int i=0;i<s_2.length;i++){
                if(s_1[i]!=s_2[i]){
                    System.out.println("The two strings are not Anagrams. ");
                    return;
                }
            }
        }
        System.out.println("The two strings are Anagrams. ");



    }
}
