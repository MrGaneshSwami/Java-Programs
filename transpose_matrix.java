// find transpose of a matrix
import java.util.*;
public class transpose_matrix {
   public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter no of rows");
    int r=sc.nextInt();
    System.out.println("Enter no of columns");
    int c=sc.nextInt();
    int arr[][]=new int[r][c];

    System.out.println("Enter matrix");
    for (int i = 0; i < r; i++) {
        for (int j = 0; j < c; j++) {
            arr[i][j]=sc.nextInt();
            
        }
        
    }
    System.out.println("Entered matrix");
    for (int i = 0; i < r; i++) {
        for (int j = 0; j < c; j++) {
            System.out.print(arr[i][j]+" ");
            
        }
        System.out.println();
        
    }
    System.out.println("Transpose of matrix");
    for (int i = 0; i < r; i++) {
        for (int j = 0; j < c; j++) {
            System.out.print(arr[j][i]+" ");
            
        }        
        System.out.println();
    }
   } 
}
