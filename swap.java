public class swap {
    public static void main(String[] args) {
        //Swap using third variable
        int x=10,y=5,z;
        z=x;
        x=y;
        y=z;
        System.out.println(x);
        System.out.println(y);


        //Swap 2 no without using third variable
        int a=11,b=15;
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println(a);
        System.out.println(b);

    }
    
}
