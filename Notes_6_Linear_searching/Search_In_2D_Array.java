//DAY-6 Notes

package Notes_6_Linear_searching;

import java.util.Arrays;

public class Search_In_2D_Array {
    public static void main(String[] args) {
        int [][]arr = {
            {1, 2, 3},
            {11, 12, 13, 14, 15},
            {200, 300, 400}
        };

        int target = 200;
        System.out.println(search1(arr, target)); // true       
        System.out.println(Arrays.toString(search2(arr, target))); // [2, 0]
    }

    // return eelement exist or not
    static boolean search1(int [][]arr, int target){
        for(int r = 0; r < arr.length; r++){
            for(int c = 0; c < arr[r].length; c++){
                if(target == arr[r][c]){
                    return true;
                }
            }
        }
        return false;
    }

    // if element exist return array of {row, column}
    static int[] search2(int [][]arr, int target){
        for(int r = 0; r < arr.length; r++){
            for(int c = 0; c < arr[r].length; c++){
                if(target == arr[r][c]){
                    int []index = {r, c};
                    return index;
                }
            }
        }
        return new int[]{-1,-1};
    }
}
