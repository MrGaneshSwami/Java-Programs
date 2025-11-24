import java.util.*;

// Check array are equal or not
public class p5array {
    public static void main(String[] args) {
        int arr1[]={10,33,22,6,555,36,55};
        int arr2[]={10,33,22,36,555,36,55};
        if(Arrays.equals(arr1,arr2)){
            System.out.println("Both are equal");
        }
        else{
            System.out.println("Both are not equal");
        }
    }
    
}
