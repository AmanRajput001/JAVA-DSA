//DAY-2 Notes 

package Notes_2_Loops_and_Conditionals;

// Reverse of number

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
    Scanner in =new Scanner(System.in);
    System.out.println("Enter the number : ");
    int num = in.nextInt();
    
    int revNum = 0;

    while(num != 0){
        int rem = num % 10;
        revNum = revNum * 10 + rem;
        num = num / 10;
    }

    System.out.println("Reverse Number is : " + revNum);
   } 
}
