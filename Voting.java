  //Check voter eligibility

import java.util.*;
public class Voting {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Your Age");
        int age=sc.nextInt();
        if(age>=18){
            System.out.println("Your Can Vote");

        }
        else{
            System.out.println("You are not eligible for Voting");
        }
    }
    
}
