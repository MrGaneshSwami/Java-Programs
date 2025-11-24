import java.util.*;



public class recursion_name {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Eneter name");
          String name=sc.nextLine();

        System.out.println("Enter no ");
        int x=sc.nextInt();

        print_name(name,x);


    }
    public static void print_name(String name,int x){
        if(x>0){
            System.out.println(name);
            print_name( name, x-1);
        }
        
    }
    
}
