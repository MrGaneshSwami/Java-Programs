//Check the year is leap year or not
import java.util.*;


public class leapyear {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter Year :");
    int year=sc.nextInt();
    if(year%4==0){
        System.out.println("This is Leap Year");
    }
    else{
        System.out.println("This is Not Leap Year");
    }

  }  
}
