// Add two matrix
import java.util.*;


public class add_matrix {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no of rows");
        int r=sc.nextInt();
        System.out.println("Enter no of columns");
        int c=sc.nextInt();
        int arr1[][]=new int[r][c];
        int arr2[][]=new int[r][c];
        System.out.println("Enter first matrix");
        
           for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                arr1[i][j]=sc.nextInt();
            }
            
        }
        System.out.println("Enter second matrix");
        
           for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                arr2[i][j]=sc.nextInt();
            }
            
        }
        System.out.println(" first matrix");
        
           for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
               System.out.print(arr1[i][j]+" ");
            
            }
            System.out.println();
            
        }
        System.out.println(" second matrix");
        
        for (int i = 0; i < r; i++) {
         for (int j = 0; j < c; j++) {
            System.out.print(arr2[i][j]+" ");
         
         }
         System.out.println();
         
     }
     System.out.println(" Addition");
        
     for (int i = 0; i < r; i++) {
      for (int j = 0; j < c; j++) {
         System.out.print(arr1[i][j]+arr2[i][j]+" ");
      
      }
      System.out.println();
      
  }
  
     
    }
}
