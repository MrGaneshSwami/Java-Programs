//Calcullate area of rectangle
import java.util.*;

public class Area {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Choose Your Shape ");
        System.out.println("1.Rectangle");
        System.out.println("2.Circle");
        System.out.println("3.Square");
        System.out.println("4.Traingle");
        int ch=sc.nextInt();
        if(ch==1){
            System.out.println("Your Selected Shape is Rectangle");
            System.out.println("Enter length");
            int l=sc.nextInt();
            System.out.println("Enter Breadth");
            int b=sc.nextInt();
            System.out.println("Area Of raectangle is"+(l*b));
            System.out.println("Perimeter Of Rectangle"+(2*(l+b)));
            
        }
        else if(ch==2){
            System.out.println("Your Selected Sshape is Circle");
            System.out.println("Enter radius");
            int r=sc.nextInt();
            System.out.println("Area Of circle is :"+(3.17*r*r));
            System.out.println("perimeter of circle is :"+(2*3.14*r));

        }
        else if(ch==3){
            System.out.println("Your selected Shape is Square");
            System.out.println("Enter length of Side Of square");
            int s=sc.nextInt();
            System.out.println("Area of square is :"+(s*s));
            System.out.println("Perimeter Of square is:"+(4*s));

        }
        else if(ch==4){
            System.out.println("Your Selected Shape is Triangle");
            System.out.println("Enter height");
            int h=sc.nextInt();
            System.out.println("Enter Base");
            int b=sc.nextInt();
            System.out.println("Area Of Triangle is"+(0.5*h*b));

            

        }
        else{
            System.out.println("Choose correct Shape");
        }

    }
    
}
