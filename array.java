import java.util.*;


public class array {
    public static void main(String[] args) {

        //Declaration
        int marks []=new int[3];
        int arr[]={13,22,33,3,3,3,3};
        int Age []=new int[3];
        Scanner sc=new Scanner(System.in);
        // for(int i=0;i<3;i++){

        //      marks[i]=sc.nextInt();
        // }
        // for (int i = 0; i < 3; i++) 
        // {
        //     System.out.println("marks "+marks[i]);
            
        // }

        int c=0;
          System.out.println("enter size");
          int size=sc.nextInt();
          int arr1[]=new int[size];
          System.out.println("Enter elements");
          for(int i=0;i<size;i++){
            arr1[i]=sc.nextInt();
            

          }
          System.out.println("Enter a number");
          int x=sc.nextInt();
          for(int i=0;i<size;i++){
            if(x==arr1[i])
            {
                System.out.println("Element Found at "+ i+" index");
                 c++;
            }
          

          }
          if(c==0){
            System.out.println("Element Not Found");
          }

        
    }
    
}
