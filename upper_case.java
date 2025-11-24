//convert lower case character to uppercase  or vice versa
import java.util.*;



public class upper_case {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a character");
        char ch=sc.next().charAt(0);
        if(ch>='A' && ch<='Z'){
            char c2=Character.toLowerCase(ch);
            System.out.println(c2);
        }
        else{
            char c2=Character.toUpperCase(ch);
            System.out.println(c2);
        }

    }
}
