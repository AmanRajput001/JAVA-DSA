package Notes_7_Binary_searching;

public class BinarySearchExampleDescending {
    public static void main(String [] args){
   
        int index = binarySearchIndex(new int[]{1034, 340, 223, 100, 45, 6, 7, 1, -1, -78, -99, -100}, 100); // Desecending order
        
        if( !(index == -1)){
            System.out.println("Element found. Index is " + index); // Execute
        }else{            
            System.out.println("Element not found."); 
        }
        
    }

    // to get index of found element
    public static int binarySearchIndex(int []nums, int target){
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