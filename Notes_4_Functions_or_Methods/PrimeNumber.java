package Notes_4_Functions_or_Methods;

// Take input inetger checks its prime or not

import java.util.Scanner;

public class PrimeNumber {
    static boolean isPrime(int num){
        if(num == 1)
            return false;
        else{
            for(int i = 2; i*i <= num; i++){
                if(num % i == 0){
                    return false;
                }
            }
            return true;
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the number : ");
        int num = in.nextInt();

        System.out.println(isPrime(num));
    }
}
