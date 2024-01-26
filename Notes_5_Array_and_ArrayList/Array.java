package Notes_5_Array_and_ArrayList;

/*
 Why we need Array ? 
    ->  to store collection of data type (its is Array)
    -> continous memory allocated to array.

 Synatx:- datatype[] arrayName = new datatpye[size];

 */
public class Array {
   public static void main(String[] args) {
    // Q: store a roll number
    int a = 10;

    // Q : store a name
    String nam = "Aman Rajput";

    // Q: store five roll numbers
    int a1 = 10;
    int a2 = 20;
    int a3 = 30;
    int a4 = 40;
    int a5 = 50;

    // Q: store 500 roll numbers ? 
    //      -> then will you declare and initialise each roll number again and again as above ? No, we will use arrays.

    int[] rollnumbers = new int[500]; 

    /*
        int[] => represent what type of data we can store in array. here, integers values only. 
        rollnumbers => varibale to be used as array. (reference variable)
        new => its is used to create object, 'new is keyword' use for dynamic memory allocation (memory allocated from heap memory)
        int[500] => size of array is 500 values it can store, and memory it takes for each value to be store is of type datatype mentioned. here, is integer (Means 4 byte each);
    */

    String[] names; // here we are just declaring array (memory not allocated)
                    // this declaration happen at compile time

    names = new String[10]; // initialisation: here, we are allocating memory to array
                            // this allocation of memory done at runtime.

    // we can directly declared and initialsed array together
    int [] arr = {1, 2, 3, 4, 5};

    /*
        so, here indexing in array:-
        
        array[index] = value

        arr[0] => 1
        arr[1] => 2
        arr[4] => 5
    */

    int [] val;
    val = new int[5];

    System.out.println(val[0]); // Output -> 0
    /*
         for integer array in java each index value first automatically intialised with zero.
    */

    String [] str;
    str = new String[5];

    System.out.println(str[0]); // Output -> null
    /*
         for String array in java each index value first automatically intialised with null.
    */
    /* 
        null is literal.
    */

    } 
}
/*
 * 1. Array objects are in Heap.
 * 2. Heap objects are not continues.
 * 3. Array In java may not be continous allocated memory -> depends on JVM. 
 */
