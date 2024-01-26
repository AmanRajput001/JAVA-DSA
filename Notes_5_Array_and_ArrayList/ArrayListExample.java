//DAY-5 Notes

package Notes_5_Array_and_ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample {
    public static void main(String[] args) {
        // Syntax
        // ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> list = new ArrayList<>(3); // inital capacity 3

        // we can add as many as value we want
        list.add(11);
        list.add(21);        
        list.add(111);
        list.add(211);
        list.add(101);
        list.add(2001);

        System.out.println(list); // [11, 21, 111, 211, 101, 2001]


        //modify
        list.contains(654); // false        
        list.contains(21);  // true

        list.set(0, 99); // changed 0th index value to 99 
        System.out.println(list); // [99, 21, 111, 211, 101, 2001] 

        list.remove(2);
        System.out.println(list); // [99, 21, 211, 101, 2001]

        // To get any element at any index 
        // System.out.println(list[2]); //Invalid to get item
        System.out.println(list.get(2)); // 211

        Scanner in = new Scanner(System.in);
        // also to take input
        for(int i=0; i < 5; i++){
            System.out.print("Enter number " + (i+1) + ": ");
           list.add(in.nextInt());
        }

        // also to take display
        for(int i=0; i < 5; i++){
            System.out.print(list.get(i) + " ");
        }
    }
}

/*
    Array-List:-
        1. Size is fixed internally
        2. say ArrayList fills by some amount.
           it will now create new arraylist of say twice size of old arraylist
           old arraylist deleted replaced by new arraylist 
        3. time complexity is constant O(1).
*/