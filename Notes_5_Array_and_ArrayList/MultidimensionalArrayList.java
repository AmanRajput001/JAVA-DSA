//DAY-5 Notes

package Notes_5_Array_and_ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class MultidimensionalArrayList {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();

        for(int i=0;  i < 3; i++){
            list.add(new ArrayList<Integer>());
        }

        Scanner in = new Scanner(System.in);
        // also to take input
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                System.out.print("Enter number: ");
                list.get(i).add(in.nextInt());
            }
        }
        /*
        --------------Output--------------
                Enter number: 900
                Enter number: 800
                Enter number: 700
                Enter number: 100
                Enter number: 200
                Enter number: 300
                Enter number: 500
                Enter number: 600
                Enter number: 700
        */

        System.out.println(list); // [[900, 800, 700], [100, 200, 300], [500, 600, 700]]
    }
}
