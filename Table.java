//print table of a no
import java.util.*;

public class Table {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a no");
        int x=sc.nextInt();
        System.out.println("Table of a no :");
        for(int i=1;i<=10;i++){
            System.out.println(i*x);
        }
    }
    
}
