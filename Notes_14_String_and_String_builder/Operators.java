package Notes_14_String_and_String_builder;

import java.util.ArrayList;

public class Operators {
    public static void main(String[] args) {
        // Operator overloading with string
        
        System.out.println('a' + 'b'); // 195
        
        System.out.println("a" + "b"); // ab

        System.out.println('a' + 3); // 100
    
        System.out.println((char)('a' + 3)); // d

        System.out.println("a" + (new Integer(56))); // a56
        System.out.println("a" + 1); // a1
        // integer will converted to Integer that will call toString()

        System.out.println("Aman" + (new ArrayList<>())); // Aman[]
        
        // System.out.println((new Integer(56)) + (new ArrayList<>()));  // ERROR
        
        /*
            Operator '+' define in java are only for primitive but when one of the values are string. 
        */

        System.out.println((new Integer(56)) + " " + (new ArrayList<>())); // 56 [] 
    }
}
