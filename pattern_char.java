public class pattern_char {
    public static void main(String[] args) {
        for(char i='A';i<='D';i++){
            for (char j = 'A'; j <= i; j++) {
                System.out.print(j);
                
            }
            System.out.println();
        }


     
        System.out.println();
        System.out.println("New Pattern");
        for (char i = 'A'; i <= 'D'; i++) {
            for(char j='A';j<=i;j++){
                System.out.print(i);
            }
            System.out.println();
            
        }
        
         char count='A';
        System.out.println();
        System.out.println("Pattern 2");
        for (char i = 'A'; i <='D'; i++) {
            for(char j='A';j<=i;j++){
                System.out.print(count+" ");
                 count++;
            }
            System.out.println();
            
        }

    }
    
}
