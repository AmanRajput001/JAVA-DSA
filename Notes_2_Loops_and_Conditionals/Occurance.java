package Notes_2_Loops_and_Conditionals;

/*
   Check the Occurance of digit in a number.
   Example :
    number = 23435391
    Occurance of 3 : 3
    Occurance of 9 : 1
 */

import java.util.Scanner;

public class Occurance {
   public static void main(String[] args) {
    Scanner in =new Scanner(System.in);
    System.out.println("Enter the number : ");
    int num = in.nextInt();

    System.out.println("Enter the digit you wants to check occurance of : ");
    int digit = in.nextInt();

    int count = 0;

    while(num != 0){
        int rem = num % 10;
        if(rem == digit){
            count += 1;
        }

        num = num / 10;
    }

    System.out.println(digit + " Occurred " + count + " times.");
   } 
}
