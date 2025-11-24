public class test{
  public static void main(String args[]){
    int n=6;
    int count=5;
     for(int i=2;i<=n;i++){
      for(int j=1;j<=i;j++){
       System.out.print(" ");
      }
      
      for(int j=1;j<=1;j++){
        System.out.print("*");
      }
      for(int j=1;j<=2*(n-i);j++){
        System.out.print(" ");
      }
      
      for(int j=1;j<=1;j++){
        System.out.print("*");
      }

      System.out.println();
    }  
  }
}