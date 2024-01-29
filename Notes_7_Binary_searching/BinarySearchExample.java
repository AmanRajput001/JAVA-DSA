package Notes_7_Binary_searching;

public class BinarySearchExample{
    public static void main(String [] args){
        if(binarySearch(new int[]{9, 10, 34, 66, 77, 89, 100, 1890}, 100)){
            System.out.println("Element found."); // Execute
        }else{            
            System.out.println("Element not found.");
        }

        if(binarySearch(new int[]{9, 10, 34, 66, 77, 89, 100, 180}, 101)){
            System.out.println("Element found."); 
        }else{            
            System.out.println("Element not found."); // Execute
        }
        
        int index = binarySearchIndex(new int[]{9, 10, 34, 66, 77, 89, 100, 180}, 100);
        if( !(index == -1)){
            System.out.println("Element found. Index is " + index); // Execute
        }else{            
            System.out.println("Element not found."); 
        }
        
    }

    public static boolean binarySearch(int []nums, int target){
        int start = 0;
        int end = nums.length - 1;

        while(start <= end){
            // int mid = (start + end) / 2; // (start + end) might exceeds the range of integer in java
            int mid = (start + (end - start) / 2);
            int middle_element = nums[mid];

            if(target < middle_element){
                end = mid - 1;
            }else{
                start = mid + 1;
            }

            if(middle_element == target){
                return true;
            }
        }

        return false;
    }

    // to get index of found element
    public static int binarySearchIndex(int []nums, int target){
        int start = 0;
        int end = nums.length - 1;

        while(start <= end){
            // int mid = (start + end) / 2; // (start + end) might exceeds the range of integer in java
            int mid = (start + (end - start) / 2);
            int middle_element = nums[mid];

            if(target < middle_element){
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
