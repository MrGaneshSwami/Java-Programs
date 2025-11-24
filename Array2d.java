import java.util.*;

public class Array2d {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter No of rows");
        int r=sc.nextInt();
        System.out.println("Enter no of colums");
        int c=sc.nextInt();
        int arr[][]=new int[r][c];
        System.out.println("Enter matrix elements");
        for (int i = 0; i <r; i++) {
            for (int j = 0; j <c; j++) {
                arr[i][j]=sc.nextInt();
                
            }

            
        }
        System.out.println("Matrix is");
        for (int i = 0; i <r; i++) {
            for (int j = 0; j <c; j++) {
                System.out.print(arr[i][j]+" ");
                
            }
            System.out.println();

            
        }
    }
}
