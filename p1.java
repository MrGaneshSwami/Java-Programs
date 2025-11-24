// // Print 1-10 Numbers Addition

// public class p1 {
//     public static void main(String[] args) {
//       int sum=0;  
//      for(int i=1;i<=10;i++){
//         sum=sum+i;

//      }
//      System.out.println("Addition is "+sum);
//     }
    
// }

// Print Table Of a no
// import java.util.*;
// public class p1{
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         System.out.println("Enter A Positive No");
//         int x=sc.nextInt();
        
//         if(x<0){
//             System.out.println("Enter valid no");
            
//         }
//         else{
//             for (int i = 1; i < 11; i++) {

//                 System.out.println(i*x);
//             }
//         }
//     }
// }


// Print factorial

// import java.util.*;
// public class p1 {
    
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         int x=sc.nextInt();
//         int sum=1;
//         for (int i = x; i > 0; i--) {
//             sum=sum*i;
//         }
//         System.out.println(sum);
//     }


// }

// Find Power
// import java.util.*;
// public class p1 {
    
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         int x=sc.nextInt();
//         int y=sc.nextInt();
//         int pow=1;
//         for (int i = 1; i <= y; i++) {
//            pow*=y;

//          }
//         System.out.println("Power is "+pow);

//     }
// }  


//Check Divisible by 5

// import java.util.*;
// public class p1{
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         System.out.println("Enter No");
//         int x=sc.nextInt();
//         if(x%5==0){
//             System.out.println("Divisible by 5");
//         }
//         else{
//             System.out.println("Not Divisible By 5");
//         }
//     }
// }





// sum of digits

// import java.util.*;
// public class p1{
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         System.out.println("Enter No");
//         int x=sc.nextInt();
//         int sum=0;
//         while(x!=0){
//             int rem=x%10;
//             sum=sum+rem;
//             x=x/10;

//         }
//         System.out.println("Sum is "+sum);
//     }
// }
    



// print prime no between two no.s
import java.util.*;
public class p1{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a starting  no");
        int x=sc.nextInt();
        System.out.println("Enter a Ending no");
        int y=sc.nextInt();
        for (int i = x+1; i < y; i++) {
          int  count=0;
            for(int j=1;j<=i;j++){
                if(i%j==0){
                    count++;
                }

            }
            if(count==2){
                System.out.println(i);}
        }
    }
}