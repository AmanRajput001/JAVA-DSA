//DAY-2 Notes 

package Notes_2_Loops_and_Conditionals;

/*
 * Take input of three number and tell which is largest.
 */

import java.util.Scanner;

public class Largest {
   public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.println("Enter three numbers :- ");
    int a = in.nextInt();
    int b = in.nextInt();
    int c = in.nextInt();

    int largest = a; // let assume first number (a) be largest

    if(largest < b){ // if b greater than largest then b is maximum.
        largest = b;
    }
    if(largest < c){// if c greater than largest then b is maximum.
        largest = c;
    }

    System.out.println("Largest Number is : " + largest);
    // -------Output------
    // Enter three numbers :- 
    // 100 400 80
    // Largest Number is : 400

    // we can also use inbuilt method // java.lang.Math

    int max = Math.max(a, b);
    max = Math.max(max,c);
    System.out.println("Largest Number is : " + largest);

   } 
}
