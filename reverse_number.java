import java.util.*;

public class reverse_number {

public static int reverse(int x){
   int rev_no=0;
   while(x!=0){
    int rem=x%10;
    rev_no=rev_no*10+rem;
    x=x/10;

   }
   return rev_no;


}

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter No");
        int x=sc.nextInt();
        System.out.println("reverse number is "+reverse(x));
        
    }
    
}
