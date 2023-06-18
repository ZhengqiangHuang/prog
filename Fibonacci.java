import java.util.Scanner;

public class Fibonacci  {

    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = myScanner.nextInt();
        System.out.println("The " + n +
                "th number in the Fibonacci sequence is: " + fibonacciIter(n));
        System.out.println("The " + n +
                "th number in the Fibonacci sequence is: " + fibonacciRec(n));
        //runnable until 46th number
    }
    public static int fibonacciIter(int n){
        if(n== 0){
            return 0;
        }
        if(n==1){
            return 1;
        }
        int f0 = 0;
        int f1 = 1;
        int fn = 0;
        for (int i = 0; i < n-1 ; i++) {
            fn = f0 + f1;
            f0 = f1;
            f1 = fn;
        }return fn;
    }

    public static int fibonacciRec(int n){
        if(n== 0){
            return 0;
        }
        if(n==1){
            return 1;
        }
        return fibonacciRec(n-1) + fibonacciRec(n-2);

    }

}