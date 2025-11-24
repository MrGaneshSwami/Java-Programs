// Check The no is Palindrome 
//ex 121 -----> 121

import java.util.*;

public class palindrome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a no");
        int n=sc.nextInt();
        int Temp=n,rev_no=0;
        while(n!=0){
            int rem=n%10;
            rev_no=rev_no*10+rem;
            n=n/10;

        }
        if(Temp==rev_no){
            System.out.println(Temp+" is a Palindrome");
        }
        else
           System.out.println(Temp+" is not palindrome");
    }
    
}
