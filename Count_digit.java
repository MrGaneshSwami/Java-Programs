 //Count No OF DIgits
 import java.util.*;



public class Count_digit {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a No");
        int x=sc.nextInt();
        int count=0;
        while(x>0){
       
            x=x/10;
            count++;
        
       
    }
    System.out.println(count);

    }
    
}
