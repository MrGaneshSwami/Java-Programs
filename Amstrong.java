import java.util.*;
/*  Amstrong number
 * x=abc
 * when a*a*a+b*b*b+c*c*c=abc
 */



public class Amstrong {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int x=sc.nextInt();
        int temp=x;
        int sum=0;
        while(x!=0){
            int rem=x%10;
            sum=sum+rem*rem*rem;
            x=x/10;
        }
        if(temp==sum){
            System.out.println("It is a amstrong no");
        }
        else{
            System.out.println("it is not amstrong no");
        }
    }
}
