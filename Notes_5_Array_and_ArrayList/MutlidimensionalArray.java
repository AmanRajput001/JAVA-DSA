//DAY-5 Notes

package Notes_5_Array_and_ArrayList;

import java.util.Arrays;
import java.util.Scanner;

public class MutlidimensionalArray { // Array of arrays
    public static void main(String[] args) {
        /*
            1 2 3
            4 5 6
            7 8 9 
        */

        int[][] arr1 = new int[3][]; // defining 2-d array
                                    // defining number of rows mandatory but column may or may not mentioned.
        
        int[][] arr2 = new int[3][3]; // three rows and three columns

        int[][] arr3 = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        //individual array size inside an array can varry
        int [][] arr4 ={
            {1, 21, 3, 77}, // no. of columns is 4
            {4, 5, 6}, // no. of columns is 3
            {7, 8, 9, 3, 2, 1} // no. of columns is 6
        };

        System.out.println(arr4[2]); // 2nd index -> arr4[2] = {7, 8, 9, 3, 2, 1}

        int [][] arr = new int[3][3];

        System.out.println(arr.length); // gives no. of rows => 3

        //how to take input
        Scanner in = new Scanner(System.in);

        for(int row = 0; row < arr.length; row++){ 

            // for each column
            for(int col = 0; col < arr[row].length; col++){
                arr[row][col] = in.nextInt();
            }
        }
        // Input -> 100 200 300 400 500 600 700 800 900

        // to display
        for(int row = 0; row < arr.length; row++){ 
            System.out.println("Row" + (row+1) +" -> " + Arrays.toString( arr[row])); 
        }
        /*
            ----------OUtput------- 
            Row1 -> [100, 200, 300]
            Row2 -> [400, 500, 600]
            Row3 -> [700, 800, 900]
        */

        //enanched for-loop (for-each loop)
        for(int[] row : arr){ 
            System.out.println(Arrays.toString(row)); 
        }
        /*
            ----------OUtput------- 
                [100, 200, 300]
                [400, 500, 600]
                [700, 800, 900]
        */
    }
}
