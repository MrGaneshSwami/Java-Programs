import java.util.*;



public class divisors {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        System.out.println("divisors are");
        for(int i=1;i<=x;i++){
            if(x%i==0)
                System.out.println(i);
        }
    }
    
}
