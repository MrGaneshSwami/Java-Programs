//Check no of days in given month
import java.util.*;


public class month_days {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter The Month Number");
    int x=sc.nextInt();
    switch(x){
        case 1:System.out.println("The no of days are 31");
              break;
        case 2:System.out.println("The no of days are 28/29");
              break;        
        case 3:System.out.println("The no of days are 31");
              break;
        case 4:System.out.println("The no of days are 30");
              break;
        case 5:System.out.println("The no of days are 31");
              break;
        case 6:System.out.println("The no of days are 30");
              break;   
        case 7:System.out.println("The no of days are 31");
              break;  
        case 8:System.out.println("The no of days are 31");
              break;
        case 9:System.out.println("The no of days are 30");
              break;
        case 10:System.out.println("The no of days are 31");
              break;
        case 11:System.out.println("The no of days are 30");
              break;
        case 12:System.out.println("The no of days are 31");
              break;
        default :System.out.println("Enter VAlid Month");
              break;
              


    }
   
  }    
}
