package Notes_14_String_and_String_builder;

import java.util.Arrays;

public class Output {
    public static void main(String[] args) {
        System.out.println(56); // 56
        /*  ... println(int i){
                String.valueOf(i) 
            }

            ... valueOf(int i){
                return Integer.toString(i);
            }

            ...toString(int i){
                // returns an string value
            }
        */
        System.out.println("Aman"); // Aman
        System.out.println(new int[] { 1, 22, 23 }); // [I@2f92e0f4 --> a hexadecimal value in string form
                                    // using toString() method available in String
                                    
        System.out.println(Arrays.toString(new int[] { 1, 22, 23 })); // [1, 22, 23]
                                    // using toString() method available in Arrays
        
        // Internally all above println() methods are different (in-built in java). =>
        // function overloading

    }
}
