public class xpattern{
    public static void main(String args[]){
       int line=5;
       for(int r=1;r<=line;r++){
        for(int c=1;c<=line;c++){
            if(r==c || r+c==line+1){
                System.out.print("* ");
            }else{
                System.out.print("  ");
            }
        }
        System.out.println();
       }
    }

}