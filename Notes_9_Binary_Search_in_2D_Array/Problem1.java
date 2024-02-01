package Notes_9_Binary_Search_in_2D_Array;
/*
    array:- 1 |  2  | 3  | 4
            5 |  6  | 7  | 8
            9 |  10 | 11 | 12


    search in an strictly sorted matrix means :- arr[1][0] > arr[0][3]
                                                 arr[2][0] > arr[1][3]
                                                    
    1. take middle column then start searching

    target = 2
    middle column => col_index = 1
    middle row => row_index = 1

    if(arr[row_index][col_index] == target){
        // found
    }else if(arr[row_index][col_index] > target){
        row_index--;
    }else{
        row_index++; 
    }

    in the end only two row remains:-
    if(arr[0][col_index] == target){
        // found
    }else if(arr[1][col_index] == target){
        // found
    }else if(target < arr[0][col_index]){
        col_index--;
    }else{
        col_index++;
    }
 */

import java.util.Arrays;

public class Problem1 {
    public static void main(String[] args) {
        int[][] arr = {
                { 1, 2, 3, 4, 5},
                {6, 7, 8, 9, 10},
                { 11, 12, 13, 14, 15}
        };

        System.out.println(Arrays.toString(binarySearch(arr, 16)));
    }

    public static int[] binarySearch(int[][] arr, int target) {

        if (arr.length == 1) {
            return bSearch(arr, target, 0, 0, arr[0].length - 1);
        }

        int row_start = 0;
        int col_index = (arr[0].length) / 2;
        int row_end = (arr.length - 1);

        // the loop run till end it only row rows left for search
        while ((row_start < (row_end - 1))) {
            int row_mid = (row_start + (row_end - row_start) / 2);

            if (target == arr[row_mid][col_index]) {
                return new int[] { row_mid, col_index };
            } else if (target < arr[row_mid][col_index]) {
                row_end = row_mid;
            } else {
                row_start = row_mid;
            }
        }

        // now we have two rows 
        if (target == arr[row_start][col_index]) {
            return new int[] { row_start, col_index };
        } else if (target == arr[row_start + 1][col_index]) {
            return new int[] { row_start + 1, col_index };
        } else if (target <= arr[row_start][col_index-1]) {
            return bSearch(arr, target, row_start, 0, col_index - 1);
        } else if (target <= arr[row_start][arr[row_start].length - 1]   && target >= arr[row_start][col_index+1]) {
            return bSearch(arr, target, row_start, col_index + 1, arr[row_start].length - 1);
        } else if (target < arr[row_start + 1][col_index]) {
            return bSearch(arr, target, row_start + 1, 0, col_index - 1);
        } else {
            return bSearch(arr, target, row_start + 1, col_index + 1, arr[row_start].length - 1);
        }
    }

    public static int[] bSearch(int[][] arr, int target, int row, int col_start, int col_end) {
        int start = col_start;
        int end = col_end;

        while (start <= end) {
            int mid = (start + (end - start) / 2);

            if (arr[row][mid] == target) {
                return new int[] { row, mid };
            } else if (target > arr[row][mid]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return new int[] { -1, -1 };
    }
}
