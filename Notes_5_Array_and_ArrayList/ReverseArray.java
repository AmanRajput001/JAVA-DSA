package Notes_5_Array_and_ArrayList;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int []arr = {1, 3, 5, 7, 9};
        System.out.println(Arrays.toString(arr)); // [1, 3, 5, 7, 9]
        
        System.out.println(Arrays.toString(revArray(arr))); // [9, 7, 5, 3, 1]
    }

    static int[] revArray(int []arr){
        int rev[];
        rev = new int[arr.length];

        for(int i = 0, j = arr.length - 1; i < arr.length && j > -1; i++, j--){
            rev[i] = arr[j];
        }
        return rev;
    }
}
