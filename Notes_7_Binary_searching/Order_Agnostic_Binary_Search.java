package Notes_7_Binary_searching;

// Order_Agnostic_Binary_Search:- means you do not know that array is sorted in which order either ascending or desecending order

public class Order_Agnostic_Binary_Search {
    public static void main(String [] args){
        int []arr = new int[]{ 19, 12, 6, 5, 3, 2, -8, -16};
        int target = -8;
        int index;
        int order;

        if(arr[0] > arr[arr.length - 1]){
            order = 1;
        }else{
            order = 0;
        }

        if(order == 1){
            index = binarySearchIndex_descending(arr , target); // Desecending order
        }else{
            index = binarySearchIndex_descending(arr, target); // Desecending order
        }

        if( !(index == -1)){
            System.out.println("Element found. Index is " + index); // Execute
        }else{            
            System.out.println("Element not found."); 
        }
        
    }

    // to get index of found element
    public static int binarySearchIndex_descending(int []nums, int target){
        int start = 0;
        int end = nums.length - 1;

        while(start <= end){
            // int mid = (start + end) / 2; // (start + end) might exceeds the range of integer in java
            int mid = (start + (end - start) / 2);
            int middle_element = nums[mid];

            if(target > middle_element){
                end = mid - 1;
            }else{
                start = mid + 1;
            }

            if(middle_element == target){
                return mid;
            }
        }

        return -1;
    }

    // to get index of found element
    public static int binarySearchIndex_ascending(int []nums, int target){
        int start = 0;
        int end = nums.length - 1;

        while(start <= end){
            // int mid = (start + end) / 2; // (start + end) might exceeds the range of integer in java
            int mid = (start + (end - start) / 2);
            int middle_element = nums[mid];

            if(target > middle_element){
                end = mid - 1;
            }else{
                start = mid + 1;
            }

            if(middle_element == target){
                return mid;
            }
        }

        return -1;
    }
}
