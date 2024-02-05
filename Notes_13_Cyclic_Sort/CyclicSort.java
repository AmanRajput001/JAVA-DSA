package Notes_13_Cyclic_Sort;

import java.util.Arrays;

public class CyclicSort {
    public static void main(String[] args) {
        int array[] = {3, 4, 1, 2, 6, 7, 5}; // When given numbers from range 1 to N  use cyclic sort.
        int n = array.length;

        System.out.println(Arrays.toString(array));

        // Cyclic Sort
        for(int i = 0; i < n;){
            int correct_index = array[i] - 1;

            if(correct_index == i){
                i++;
            }else{
                int temp = array[correct_index];
                array[correct_index] = array[i];
                array[i] = temp;
            }
        }
        
        System.out.println(Arrays.toString(array));
    }
}
