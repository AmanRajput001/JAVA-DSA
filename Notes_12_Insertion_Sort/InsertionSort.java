package Notes_12_Insertion_Sort;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int array[] = { 6, 7, 2, 1, 3, 0, -1, -2, 100, 44, 55, 66, 77, 22, 1 };
        int n = array.length;

        System.out.println(Arrays.toString(array));
        
        // Insertion sort
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j > 0; j--) {
                if (array[j] < array[j - 1]) {
                    int temp = array[j];
                    array[j] = array[j - 1];
                    array[j - 1] = temp;
                } else { // left hand side array already sorted
                    break;
                }
            }
        }

        System.out.println(Arrays.toString(array));
        
    }
}
