//DAY-4 Notes 

package Notes_4_Functions_or_Methods;

import java.util.Scanner;

/*
   Armstrong number :- is a number that is the sum of its own digits, each raised to the power of the number of digits. For example, 153 is an Armstrong number because:
                       1^3 + 5^3 + 3^3 = 1 + 125 + 27 = 153
 */

// Check wether given three digit number input is Armstrong Number or not;

public class ThreeDigit_ArmstrongNumber {

    static boolean isArmstrong(int num, int pow){
        int sum = 0;
        int tempNum = num;

        while(tempNum != 0){
            int rem = tempNum % 10;
            tempNum = tempNum / 10;

            sum += Math.pow(rem, pow); // rem * rem * rem
        }

        if(sum != num)
            return false;
        return true;
    }
    public static void main(String[] args) {
        System.out.println("Enter Three-digit number: ");
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();

        System.out.println(num + " is a Armstrong Number : " + isArmstrong(num, 3));

        //All three didgit Armstrong Numbers
        for(int i=100; i < 1000; i++){
            if(isArmstrong(i, 3))
                System.out.print(i + " ");
        } // Output -> 153 370 371 407
    }
}
