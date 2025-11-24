import java.util.*;
// Check Even Odd

public class even_odd {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Range");
        int x=sc.nextInt();
        int sum=0;
        
      //print odd no in given range

     for(int i=1;i<=x;i++){
        if(i%2 != 0){
            System.out.print(i+ "\t");
        }

     }    

     //Print sum of odd no
     for(int i=1;i<=x;i++){
        if(i%2 != 0){
           sum=sum+i;
        }

     }  
     System.out.println("Sum is "+sum);  

}
}
