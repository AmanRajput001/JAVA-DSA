package Notes_5_Array_and_ArrayList;

import java.util.Arrays;

// swap element at index 2 and 4 by creating method
public class Swap {
    public static void main(String[] args) {
        int []arr = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(arr)); // [1, 2, 3, 4, 5]

        swapping(arr, 2, 4);
        System.out.println(Arrays.toString(arr)); // [1, 2, 5, 4, 3]
    }

    static void swapping(int []arr, int index1, int index2){
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}
