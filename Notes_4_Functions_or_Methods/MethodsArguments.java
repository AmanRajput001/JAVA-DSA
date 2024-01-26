package Notes_4_Functions_or_Methods;

import java.util.Scanner;

/*
      acess_modifier return_type name(<arguments>){
        // body
        return statement;
      }

      // arguments:- passing values of particular data type when calling function
     */

//Example:-
public class MethodsArguments {
    public static int sum(int a, int b){ // method with parameters (arguments)
        Scanner in = new Scanner(System.in);
        int sum = a + b;

        return sum; // returning sum (inetger)
                    // going back to from where it called
    }

   public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the two numbers: ");
        int a = in.nextInt();
        int b = in.nextInt();

        // passing arguments (parameters)
        int ans = sum(a, b); 
        System.out.println("Result : " + ans);
   }
}
