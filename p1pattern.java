//print different patterns




public class p1pattern {
    public static void main(String[] args) {


        // *
        // **
        // ***
        // ****


        // for (int i = 1; i <5; i++) { //rows
        //     for (int j = 0; j <i ; j++) {   //columns
        //         System.out.print("*");
                
        //     }
        //     System.out.println();
            
        // }
       


        // *** 
        // **
        // *
    
        // for (int i = 1; i <=3 ; i++) {
        //      for (int j = 3; j >=i; j--) {
        //         System.out.print("*");
                
        //      }            
        //      System.out.println();
        // }




        /*      
        * triangle
         */
       
          for (int i = 1; i <= 5; i++) {



            for (int j = i; j <5; j++ ) {   //space
                System.out.print(" ");

                
            }
            for (int k = 1; k <=i; k++) {
                System.out.print("*");
                
            }

            System.out.println();
          }
    
    
    }
    
}
