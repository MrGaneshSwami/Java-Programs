import java.util.*;



public class Operator {
    public static void main(String[] args) {
        //Artamatic opearator
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number1:");
        int a=sc.nextInt();
        System.out.println("Enter number2:");
        int b=sc.nextInt();

        System.out.println("Arathamatic Operator");

        System.out.println();
        System.out.println("addition"+(a+b));
        System.out.println("substrsction"+(a-b));
        System.out.println("multiplication"+(a*b));
        System.out.println("division is"+(a/b));
        
         //Realational Opearator
         System.out.println();


        System.out.println("Realational Operator");
         System.out.println("true/false "+(a<b));
         System.out.println("trute/false "+(a>b));
         System.out.println("true/false "+(a==b));
         System.out.println("true/false "+(a!=b));
        System.out.println();
         //Logiacal Oprataor

         System.out.println("Logical Opearator");
         

         System.out.println((10>2)&&(2<5));
         System.out.println((10>55)||(5>2));
         System.out.println((10==15)&&(12>3));
         System.out.println();

         //Increment /Decrement Operator
    
        System.out.println("Incre/decr Opeataor");
         System.out.println(++a);
         System.out.println(a++);
         System.out.println(b--);
         System.out.println(--b);
         System.out.println();

         //Assignment Opearator

         System.out.println("Assignment Operator");
         System.out.println(a+=a);
         System.out.println(a-=a);
         System.out.println(a*=a);
         System.out.println();


         //Ternary Operator or conditional Operator

         System.out.println("Ternary Oprator");
         int max=(a>b) ? a : b ;
         System.out.println(max);
        




    }
    
}
  