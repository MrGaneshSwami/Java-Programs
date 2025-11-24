import java.util.*;
public class natural_no {
       //print n natural no
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int sum=0;
        System.out.println("Enter a Limit ");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            System.out.print(i+" ");
        }

      //print sum of natural no
      for(int i=1;i<=n;i++){
        sum=sum+i;

      }
      System.out.println("Sum of NO is:"+sum);
      
    }
    
}
