import java.util.*;
public class Ex6_Find_the_Longest_Word_in_a_Sentence {
    public static void main(String[]args){
        Scanner scanner=new Scanner(System.in);
        String s=scanner.nextLine();
        String[] arr=s.split(" ");
        String longest=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i].length()>longest.length()){
                longest=arr[i];

            }
        }
        System.out.println(longest);

    }
}
