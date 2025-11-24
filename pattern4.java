public class pattern4 {
    public static void main(String[] args) {
        for (int i = 1; i <=5; i++) {
            for (int j = 1; j <=i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }



        System.out.println("New pattern");
        for (int i = 1; i <=5; i++) {
            for (int j = 1; j <=i; j++) 
            {
                 System.out.print(i);                
            }
            System.out.println();
            
        }
        System.out.println();
        System.out.println("New pattern");
        int count=0;

        for (int i = 1; i <=5; i++) {
           for (int j = 1; j <=i; j++) {
            count++;
            System.out.print(count+" ");
             }   
           System.out.println();         
        }
    }
    
}
