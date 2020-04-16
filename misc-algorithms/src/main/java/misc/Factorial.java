package misc;

/*
    Program to find out the factorial of a number
    factorial(n) = 1 x 2 x 3 x 4.....x n
 */
public class Factorial {

    public static void main(String args[]){

        System.out.println("\nFactorial of 5 is : " + factorial(5));

        System.out.println("Factorial of 3 is : " + factorial(3));

        System.out.println("Factorial of 8 is : " + factorial(8));
    }

    public static int factorial(int n){
        if( n == 1) {
            return 1;
        }else{
            return n * factorial(n-1);
        }
    }
}
