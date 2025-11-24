import java.util.*;

public class recursion2 {
   
  

    

    
    public static void good_no(int x){
        int count=0;
        int newcount=0;
        int r=x%10;
        x=x/10;
        if(r%2==0){
            count++;
        }
        else{
            newcount++;
        }
        if(x>0){
            good_no(x);
        }
       else{ if(count==newcount){
            System.out.println("Good no");
        }
        else{
            System.out.println("not good no");
        }
    }


    }


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a no");
        int x=sc.nextInt();
        
       
        good_no(x);
       

    }
}
