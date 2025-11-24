// Array Problems
import java.util.*;
public class p2array {
  public static void main(String[] args) {
   int arr[]=new int[5];
   Scanner sc=new Scanner(System.in);
//get input array from user
   System.out.println("Enter array elements");
   for(int i : arr){
    arr[i]=sc.nextInt();
   }



    //sort the array
    for(int i=0;i<arr.length;i++){
        for(int j=0;j<arr.length;j++){
            if(arr[i]<arr[j]){
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
    }
    // Find largest no
   int x=arr[arr.length-1];
   System.out.println("Largest Element is  "+x);
    
   //sum of array elements
   int sum=0;
   for(int i :arr){
    sum=sum+i;

   }
   System.out.println("sum is "+sum);

    

  }

    
}
