// Dublictions
import java.util.*;


public class p4array {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr[]=new int[5];
        int flag=0;

        System.out.println("Enter element in array");
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
            
        }
        // Arrays.sort(arr);
       for (int i = 0; i < arr.length; i++) {
        // if(arr[i]==arr[i]){
        //     System.out.println(arr[i]+" is duplicate");
        // }
   
        for(int j=0;i<arr.length;i++){
            if(arr[j]==arr[i]){
                flag++;
            }
        }

            
     }
     if(flag>0){
       System.out.println("Dublicate count");
       System.out.println(flag);
    
    }}
}

