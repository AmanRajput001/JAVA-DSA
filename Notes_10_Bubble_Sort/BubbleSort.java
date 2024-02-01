package Notes_10_Bubble_Sort;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int []array = {2, 7, -1, -8, 6, 5, 1, 0, 78, 100, 34};
        
        System.out.println(Arrays.toString(array));

        int n = array.length;

        // Bubble sort
        for(int i = 0; i < n; i++){
            boolean flag = true;
            for(int j = 0; j < n - 1 - i; j++){ // as after each pass from backend i+1 no. of elements are sorted
                
                if(array[j] > array[j+1]){  // comapre adjust element
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
        
                    flag = false;
                }
            }
        
            if(flag == true){
                break;
            }
        }

        System.out.println(Arrays.toString(array));
    }
}
