import java.util.*;

public class countdigit {
   
public static int counthh(int x){

    if(x==0)
      return 1;
    int count=0;
   while(x!=0){

           x=x/10;
           count++;
     }
     return count;
}
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter a number");
       int x=sc.nextInt();

        System.out.println(counthh(x));

        
    }
    
}
