import java.util.*;



public class char_print{
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Charater");
        char ch=sc.next().charAt(0);

        //Check Whether Character is Vowel Or Consonent
        if(ch=='a'|| ch=='e'|| ch=='i' || ch=='o' || ch=='u'){
            System.out.println("Vowel");
        
        }
        else{
           System.out.println("Consonent");
        }

        
    }

    
}
