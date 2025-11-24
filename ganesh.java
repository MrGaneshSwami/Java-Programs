

public class ganesh {
    public static void main(String[] args) {
       
        int n=5;
       
        for(int r=1;r<=n;r++){
            // for space
            for(int s=1;s<=n-r;s++){
                System.out.print("  ");
            }

            // for star
            for(int c=1;c<=2*r-1;c++){
                if(c==1 || c==2*r-1){
                System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        for(int r=n-1;r>=1;r--){
            // for space 
            for(int s=1;s<=n-r;s++){
                System.out.print("  ");
            }

            // for star
            for(int c=1;c<=2*r-1;c++){
                if(c==1 || c==2*r-1){
                System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
