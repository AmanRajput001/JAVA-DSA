package Notes_16_Recursion;

public class Fibonacci {
   public static void main(String[] args) {
    System.out.println(fibonacciNumber(30));
   } 

   static long fibonacciNumber(long n){

    if(n == 0 || n == 1){
        return 1;
    }
    return n*fibonacciNumber(n-1);
   }
}
