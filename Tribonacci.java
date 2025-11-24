// Tribonacci series 
// 0 1 2 3 6 11 20 .......
import java.util.*;


public class Tribonacci {
    public static void main(String[] args) {
        int term,a=0,b=1,c=2,d;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the range");
        term=sc.nextInt();
        for (int i = 1; i <=term; i++) {
            System.out.print(a+" ");
            d=a+b+c;
            a=b;
            b=c;
            c=d;

            
        }
    }
    
}
