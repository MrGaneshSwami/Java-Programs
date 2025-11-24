
//print A to Z
import java.util.*;
public class print_A_Z{
   public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int a=1,b=3,c=4;
    System.out.println(Math.max(c,(Math.max(a,b))));

    for(char i='A';i<='Z';i++){
        System.out.print(i+" ");
        
    }

   }
}