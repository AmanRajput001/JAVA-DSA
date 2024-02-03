package Notes_11_Selection_Sort;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int array[] = {100, 99, 77, 66, 44, 33, 22, 11, 22, 11, 13, 1, -1, 0, -1};
        int n = array.length;

        System.out.println(Arrays.toString(array));
        
        // Selection Sort
        for(int k = 0; k < n; k++){
            int max = 0;
            for(int i = 0; i < n - k; i++){
                if(array[max] < array[i]){
                    max = i;
                }
            }
            int temp = array[n - 1 - k];
            array[n - 1 - k] = array[max];
            array[max] = temp;
        }
        
        System.out.println(Arrays.toString(array));
    }
}
