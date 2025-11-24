import java.util.*;



public class recursio1 {
    
    public static void Table(int x,int i){

        
        if(i>10)
         return;{
            
         }
        System.out.println(x*i);
        Table( x,i+1);

      

}





    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int i=1;
        Table(x,i);
        
    }
    
}
