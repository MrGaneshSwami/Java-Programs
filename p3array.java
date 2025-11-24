//Search Element in array
import java.util.*;

public class p3array {
    public static void main(String[] args) {
        int arr[]=new int[5];
        Scanner sc=new Scanner(System.in);
     //get input array from user
        System.out.println("Enter array elements");
        for(int i=0;i<arr.length;i++){
         arr[i]=sc.nextInt();
        }

        System.out.println("Enter a element to search");
        int x=sc.nextInt();
        int flag=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==x){
                flag++;
            }
        }
        if(flag>0){
          System.out.println("Element found");
        }
        else{ 
          System.out.println("element not found ");
        }
    }
}
