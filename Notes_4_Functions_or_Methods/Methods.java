//DAY-4 Notes 

package Notes_4_Functions_or_Methods;

import java.util.Scanner;

// In java we call function as Method.
// Method:- a block of code that we wants to re-use again and again as per needed.
// Syntax:-
    /*
      acess_modifier return_type name(<arguments>){
        // body
        return statement;
      }

      // return type : what value that function (method) will return
      // if return type is void return nothing
      // if return type is int return intger
     */

// Take input of two numbers and print sum, repeat process till n times.
public class Methods {
    // Method name 'sum1()'
    public static void sum1(){ // sum of two numbers
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the two numbers: ");
        int a = in.nextInt();
        int b = in.nextInt();

        System.out.println("Sum is: " + (a + b));
    }

    public static int sum2(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the two numbers: ");
        int a = in.nextInt();
        int b = in.nextInt();
        int sum = a + b;

        return sum; // returning sum (inetger)
                    // going back to from where it called
    }

   public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter n: ");
        int n = in.nextInt();

        for(int i = 0; i < n; i++){ // repeating n-times
            sum1(); // calling a method
        }

        // using return_type
        int ans = sum2();
        System.out.println("Result : " + ans);
   } 

}
