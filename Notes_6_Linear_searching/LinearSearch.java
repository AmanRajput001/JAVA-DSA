package Notes_6_Linear_searching;

/*
    Linear Searching:- start searching for element from element at index 0, till you  find the element.
                       Array may be unsorted in linear search.

    int []arr = {18, 12, 9, 14, 77, 50}
    --> Find wheather 14 exist in array or not ?
    
    is (arr[0] == 14) => false
    is (arr[1] == 14) => false
    is (arr[2] == 14) => false
    is (arr[4] == 14) => true => 14 exist in array.

    Time complexity of linear search:- 
        Best case: O(1) // element found at index 0th.
        Worst case: O(N),   N is size of array
    
*/

// search the element 
public class LinearSearch {
    public static void main(String[] args) {
        int []arr = {18, 12, 9, 14, 77, 50};
        int element1 = 77;
        int element2 = 78;

        int index = linearSearch(arr, element1); //  4
        display(element1, index);

        index = linearSearch(arr, element2); //  -1
        display(element1, index);
    }

    // search in the array: return the index if item found
    // Otherwise if item is not found return -1
    static int linearSearch(int[] arr, int element){
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == element){
                return i;
            }
        }
        return -1;
    }

    static void display(int element, int index){
        if(index != -1){
            System.out.println("Index of element " + element + " is: " + index);
        }
        else{
            System.out.println("Element " + element + " not found");
        }
    }

    /*-------------Output---------------
            Index of element 77 is: 4
            Element 77 not found
     */
}
