package misc;

/*
  Program to find the Nth Fibonacci Number in the series.
  Fibonacci Series = 0 1 1 2 3 5 8 13 21 34 55 89 144 ...
 */

public class NthFibonacciNumber {

    public static void main(String args[]) {

        System.out.println("5th Fibonacci Number is : " + findNthFibonacci(5));
        System.out.println("7th Fibonacci Number is : " + findNthFibonacci(7));
        System.out.println("9th Fibonacci Number is : " + findNthFibonacci(9));

    }

    // Function to return Nth Fibonacci Number
    private static int findNthFibonacci(int n) {
        if (n < 0) {            // Input should be greater than 0, else Invalid Input.
            System.out.println("Invalid Input");
            return 0;
        } else if (n <= 2) {     // Base Condition for Recursion
            return n - 1;
        } else {
            return findNthFibonacci(n - 1) + findNthFibonacci(n - 2);
        }
    }
}
