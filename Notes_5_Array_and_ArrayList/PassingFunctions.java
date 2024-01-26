//DAY-5 Notes

package Notes_5_Array_and_ArrayList;

import java.util.Arrays;
/*
 * Strings are immutable in java. (object cannot be chnaged).
 * Arrays are mutable in java. (objects can be changed)
 */
public class PassingFunctions {
    public static void main(String[] args) {
       int []nums = {1, 2, 3, 4, 5};
       System.out.println(Arrays.toString(nums)); // [1, 2, 3, 4, 5]

       change(nums);
       System.out.println(Arrays.toString(nums)); // [99, 2, 3, 4, 5]
    }
    static void change(int []arr){
        arr[0] = 99;
    }
}
