package Notes_9_Binary_Search_in_2D_Array;
/*
    Searching in 2D Array (Matrices)

    array:- 18 |  9  | 12
            36 | -4  | 91
            44 |  33 | 16

            target = 33

    Unsorted.
    We acn search with help of linear search, time complexity will be O(row*col)
-------------------------------------------------------------------------------------------------------------------------    
    array:- 10 |  20  | 30 | 40
            15 |  25  | 35 | 45
            28 |  29  | 37 | 49
            33 |  34  | 38 | 50

            target = 37
            
    sorted matrix in row and col wise manner.
    if here we use linearn search then time complexity in worst case will be O(row*col)

    row = 0;
    col = total no of col - 1

    case 1: if element == target => found
    case 2: if element < target  => row++
    case 3: if element > target => col--

    Time complexity => n+n = 2n => O(2n) ::- O(n)    (constants ignored)
*/

import java.util.Arrays;

public class BinarySearch2D {
    public static void main(String[] args) {
        int [][]arr = {
            {4, 6, 8, 10},
            {7, 9, 10, 11},
            {17, 19, 100, 101}
        };

        System.out.println(Arrays.toString(binarySearch(arr, 19)));
    }

    public static int[] binarySearch(int [][]arr, int target){

        int row = 0;
        int col = arr[0].length - 1;

        while(row < arr.length && col >= 0){
            if(target == arr[row][col]){
                return new int[]{row, col};
            }else if(target < arr[row][col]){
                col--;
            }else{
                row++;
            }
        }
        return new int[]{-1, -1};
    }
}
