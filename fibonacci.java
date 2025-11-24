// print  fabonacci series
//0 1 1 2 3 5 8 ....
import java.util.*;

public class fibonacci {
    public static void main(String[] args) {
     
        int x=0,y=1,z,term;
        System.out.println("Enter Term");
        Scanner sc=new Scanner(System.in);
        term=sc.nextInt();
        for (int i = 1; i <=term; i++) {
            
             System.out.print(x+ " ");
             z =x+y;
             x=y;
             y=z;
            
        }
        
    }
    
}
