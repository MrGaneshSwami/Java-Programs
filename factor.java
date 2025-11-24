// Find factors of a No
import java.util.*;


public class factor {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a No");
        int x=sc.nextInt();
        System.out.println("factors of i");
        for(int i=1;i<=x;i++){
            if(x%i==0){
                System.out.println(i);
            }
        }

    }
    
}
