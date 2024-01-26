package Notes_4_Functions_or_Methods;

import java.util.Arrays;

// VarArgs => varibale number of arguments (when we do not know how many arguments we want to give).
// Syntax:-   methodName(dataType ...varibale){ //body }
// Note:- varibale length argument must be last argument.

public class Variable_Arguments {
    static void fun1(int ...values){ // varible arguments
        // internally it will take array of integers
        System.out.println(Arrays.toString(values));
    }
    
    // Note:- varibale length argument must be last argument.
    /*
        static void fun1(int a, int ...values, int b){ // Invalid => Error

        }
    */
    static void fun2(int a, int b, int ...values){

    }

    public static void main(String[] args) {
        fun1(2, 3, 4, 5);
    }
}
