// Check Whether no is positive or negative
import java.util.*;


public class Positive {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a no");
        int x=sc.nextInt();
        if(x>0){
            System.out.println("Given No is Positive");

        }
        else if(x<0){
            System.out.println("The no is negative");
        }

    }
}
