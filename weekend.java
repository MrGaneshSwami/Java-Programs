import java.util.*;

public class weekend {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Code of Day");
        int x=sc.nextInt();
        switch(x){
            case 1:System.out.println("Monday");
                 break;
            case 2:System.out.println("Tuesday");
                 break;
            case 3:System.out.println("Wednsday");
                 break;
            case 4: System.out.println("Thursday");
                 break;
            case 5:System.out.println("Friday");
                 break;
            case 6:System.out.println("saturday");
                 break;
            case 7:System.out.println("Sunday");
                 break;
            default:System.out.println("Enter Valid Code");
                 break;    

        }
    }
    
}
