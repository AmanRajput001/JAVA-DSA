package Notes_8_Binary_search_Questions;
/*  Problem 5:
    You are given a sorted array consisting of only integers where every element appears exactly twice, except for one element which appears exactly once.

    Return the single element that appears only once.

    Your solution must run in O(log n) time and O(1) space.

    

    Example 1:

    Input: nums = [1,1,2,3,3,4,4,8,8]
    Output: 2
    Example 2:

    Input: nums = [3,3,7,7,10,11,11]
    Output: 10 
*/

public class Problem5 {
        public static int singleNonDuplicate(int[] arr) {
            for (int element : arr) {
                int start = 0;
                int end = arr.length - 1;
                while (start <= end) {
                    int mid = start + (end - start) / 2;
            
                    if (element == arr[mid]) {
                        if ((mid - 1 >= 0 && arr[mid - 1] == element) || (mid + 1 < arr.length && arr[mid + 1] == element)) {
                            // Element is repeated, move on to the next element
                            break;
                        } else {
                            // Element is non-repeated
                            return element;
                        }
                    } else if (element < arr[mid]) {
                        end = mid - 1;
                    } else {
                        start = mid + 1;
                    }
                }
            }
            
            // No non-repeated element found
            // You might want to handle this case depending on your requirements
            return -1;
        }

    public static void main(String[] args) {
        int arr [] = {1,1,2,2,3,3,4,4,5,5, 6,6,7};
       System.out.println(singleNonDuplicate(arr));
    }
}
