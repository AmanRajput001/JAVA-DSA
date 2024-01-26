//DAY-2 Notes 

package Notes_2_Loops_and_Conditionals;

//Check case of Character inserted by user (Lower case or Upper case)

import java.util.Scanner;

public class CheckCase {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        /*
            trim() => used to remove extra spaces before and after the word
         */

        char ch = in.next().trim().charAt(0); // character at index 0
        
        if(ch >= 'a' && ch <= 'z'){
            System.out.println("Lower Case");
        }else{
            System.out.println("Upper Case");
        }
        
    }
}
