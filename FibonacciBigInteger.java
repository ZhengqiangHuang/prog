import java.math.BigInteger;
import java.util.Scanner;

public class FibonacciBigInteger {

    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = myScanner.nextInt();
        long start1=System.nanoTime();
        System.out.println("The " + n +
                "th number in the Fibonacci sequence is: " + fibonacciIter(n));
        long end1=System.nanoTime();
        System.out.printf("Iterative time in milliseconds: +%.3f "+ "ms"+"%n"
                ,(double) (end1 - start1) / 1000000);
        long start2=System.nanoTime();
        System.out.println("The " + n +
                "th number in the Fibonacci sequence is: " + fibonacciRecCache(n));
        //runnable until 47th number
        long end2=System.nanoTime();
        System.out.printf("Recursive time in milliseconds: +%.3f "+ "ms"+"%n",
                (double)(end2-start2)/1000000);
        //System.out.println("The " + n +
        //        "th number in the Fibonacci sequence is: " + fibonacciRec(n));
        //runnable until 46th number
    }
    public static BigInteger fibonacciIter(int n){
        if(n== 0){
            return BigInteger.valueOf(0);
        }
        if(n==1){
            return BigInteger.valueOf(1);
        }
        BigInteger f0 = BigInteger.valueOf(0);
        BigInteger f1 = BigInteger.valueOf(1);
        BigInteger fn = BigInteger.valueOf(0);
        for (int i = 0; i < n-1 ; i++) {
            fn = f0.add(f1);
            f0 = f1;
            f1 = fn;
        }return fn;

    }

    public static BigInteger fibonacciRec(int n){
        if(n== 0){
            return BigInteger.valueOf(0);
        }
        if(n==1){
            return BigInteger.valueOf(1);
        }
        return fibonacciRec(n-1).add(fibonacciRec(n-2));

    }

    public static BigInteger fibonacciRecCache(int n ){
        BigInteger[] cache=new BigInteger[n+1];
        return fibonacciRecCache(n, cache);
    }
    public static BigInteger fibonacciRecCache(int n,BigInteger[] cache){
        if(cache[n]==null) {
            if (n == 0) {
                cache[0] = BigInteger.valueOf(0);
                return cache[0];
            }
            if (n == 1) {
                cache[1] = BigInteger.valueOf(1);
                return cache[1];
            }
            cache[n] = fibonacciRecCache(n - 1,cache).add(fibonacciRecCache(n - 2,cache));
            return fibonacciRecCache(n-1,cache).add(fibonacciRecCache(n-2,cache));
        }
        return cache[n];

    }
}
