//DAY-5 Notes

package Notes_5_Array_and_ArrayList;

import java.util.Arrays;
import java.util.Scanner;

public class InputArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Array of primitives
        int[] arr = new int[5];
        arr[0] = 11;
        arr[1] = 12;
        arr[2] = 13;
        arr[3] = 14;
        arr[4] = 15;
        // [11, 12, 13, 14, 15]
        System.out.println(arr[3]); // 14

        //we can use for-loop to take input array
        for(int i=0; i < arr.length; i++){ // length is an attribute used for provide length of array
            System.out.print("Enter number " + (i+1) + ": ");
            arr[i] = in.nextInt();
        }
        /*-----------Output----------
            Enter number 1: 100
            Enter number 2: 200
            Enter number 3: 300
            Enter number 4: 400
            Enter number 5: 500
        */

        //we can use for-loop to display array
        for(int i=0; i < arr.length; i++){ // length is an attribute used for provide length of array
            System.out.print(arr[i] + " ");
        }
        /*-----------Output----------
            100 200 300 400 500
        */

        //Enanched for-loop to display (for-each loop)
        for(int value: arr){ // every element of array, print the element
            System.out.println(value + " "); // value represent each element of array
        }      
        /*-----------Output----------
            100 200 300 400 500
        */

        //simple way to display array
        System.out.println(Arrays.toString(arr)); // Output -> [100 200 300 400 500]

    // System.out.println(arr[5]); // show error ArrayIndexOutOfBound Error

//--------------------------------------------------------------------------------------------------------------------------------------------------------------
        //Array of objects
        String []str = new String[4];

        System.out.println("Enter four words: ");
        //we can use for-loop to take input array
        for(int i=0; i < str.length; i++){ // length is an attribute used for provide length of array         
            str[i] = in.next();
        }
        /*-----------Output----------
            Enter four words:
            India
            Lanka
            Nepal
            USA
        */

        System.out.println(Arrays.toString(str)); // [India, Lanka, Nepal, USA]

        //modifying
        str[1] = "Aman Rajput";
        System.out.println(Arrays.toString(str)); // [India, Aman Rajput, Nepal, USA]
    }
}
