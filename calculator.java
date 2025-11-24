// Design a calculator
import java.util.*;

public class calculator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number 1:");
        int n1=sc.nextInt();
        System.out.println("Enter NO 2:");
        int n2=sc.nextInt();
        System.out.println("Choose Operation");
        System.out.println("1.Add");
        System.out.println("2.Substract");
        System.out.println("3.Multiply");
        System.out.println("4.Divide");
        int ch=sc.nextInt();
        if(ch==1){
            System.out.println("Addition is :"+(n1+n2));
        }
        else if(ch==2){
            System.out.println("Sustraction is :"+(n1-n2));

        }
        else if(ch==3){
            System.out.println("Multiplication is :"+(n1*n2));
        }
        else if(ch==4)
        {
            System.out.println("Division is"+(n1/n2));

        }
        else{
            System.out.println("Invalid Opeartion");
        }
    }
    
}
