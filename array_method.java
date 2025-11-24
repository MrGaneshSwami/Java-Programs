//Declare a array
//Arrays method
import java.util.*;


public class array_method{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Array Size");
        int x=sc.nextInt();
        int arr[]=new int[x];
        int arr2[]=new int[x];
        System.out.println("Enter Elements in Array");
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
            
        }
        System.out.println("Enter Elements in Array");
        for (int i = 0; i < arr2.length; i++) {
            arr2[i]=sc.nextInt();
            
        }
   int array3[]=Arrays.copyOf(arr,arr.length-1);

        //methods of Arrays Class
         Arrays.sort(arr);
       boolean b=Arrays.equals(arr,arr2); //check elements array elements
         
        System.out.println("Sorted Array");
        for(int i=arr.length-1;i>=0;i--){
             System.out.print(arr[i]+" ");
         }
         System.out.println("Sorted Array");
         for(int i=arr2.length-1;i>=0;i--){
              System.out.print(arr2[i]+" ");
          }
         System.out.println(b);
         



    }
}
