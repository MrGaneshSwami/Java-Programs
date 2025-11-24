// Perfect no
//if the addition of all divisors of a no is equal to the number
//ex. 6---->1+2+3=6
import java.util.*;

public class perfect_no {
   public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter a number");
    int x=sc.nextInt();
    int sum=0;
    for(int i=1;i<x;i++){
        if(x%i==0){
            sum=sum+i;
        }
         
    }
    if(sum==x){
        System.out.println(x+" is a perfect no");

    }
    else{
        System.out.println(x+" is not a perfect no");
    }
   }   
}
