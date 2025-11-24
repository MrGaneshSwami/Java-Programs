public class pattern2 {
    public static void main(String[] args) {
        
       int n=5;
       for(int r=1;r<=n;r++){
        // for space
        for(int s=1;s<=n-r;s++){
            System.out.print("  ");
        }

        // for star
        for(int c=1;c<=n;c++){
            System.out.print("* ");
        }
        System.out.println();
       }
    }
    
}
