import java.util.*;
import java.lang.*;
import java.io.*;
import java.lang.Math;

public class Main {

    // Function to check if a number is prime
    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    // Function to count the semi-prime numbers in the array
    public static int semiPrime(int N, int A[]) {
        int result = 0;

        // Iterate over the array to find semi-prime numbers
        for (int i = 0; i < N; i++) {
            int number = A[i];
            // Check if the number is a semi-prime
            for (int j = 2; j <= Math.sqrt(number); j++) {
                if (number % j == 0 && isPrime(j)) {
                    int otherFactor = number / j;
                    // If the other factor is also prime, it's a semi-prime
                    if (isPrime(otherFactor)) {
                        result++;
                        break; // No need to check further once we find a semi-prime
                    }
                }
            }
        }

        return result;
    }

    public static void main(String[] args) {
        // INPUT: Reading the number of elements and the array
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); // Number of elements
        int A[] = new int[N]; // Array to store the numbers

        // Reading the elements into array A
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }

        // OUTPUT: Calling the semiPrime function and printing the result
        System.out.println(semiPrime(N, A));

        // Close the scanner to avoid memory leaks
        sc.close();
    }
}